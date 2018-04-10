package io.pivotal.spring.bian.service;

import java.util.HashMap;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.pivotal.spring.bian.exception.IllegalServiceOperationException;
import io.pivotal.spring.bian.exception.RestResponseEntityExceptionHandler;
import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.BehaviorQualifier;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.dto.BianApiRequest;
import io.pivotal.spring.bian.model.dto.BianApiResponse;
import io.pivotal.spring.bian.model.genericartifact.GenericArtifact;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@EnableConfigurationProperties(ServiceProperties.class)
public abstract class BianServiceController {

	@Autowired
	ServiceProperties serviceProperties;
	
	static final Logger logger = LoggerFactory.getLogger(BianServiceController.class);
	
	@ControllerAdvice
	static public class BianServiceExceptionHandler extends RestResponseEntityExceptionHandler {}
	
	private ControlRecord<? extends AssetType, ? extends GenericArtifact, ? extends BehaviorQualifier> controlRecord;
	
	private BianServiceInfo bianServiceInfo;
	
	private static final ModelMapper modelMapper = new ModelMapper();
	
	public BianServiceController() {
		this.bianServiceInfo =  new BianServiceInfo(getServiceDomain(), getFunctionalPattern(), getControlRecord());
	}
	
	public BianServiceController(ControlRecord<? extends AssetType, ? extends GenericArtifact, ? extends BehaviorQualifier> controlRecord) {
		setControlRecord(controlRecord);
	}
	
	public ControlRecord<? extends AssetType, ? extends GenericArtifact, ? extends BehaviorQualifier> getControlRecord() {
		return controlRecord;
	}

	public void setControlRecord(ControlRecord<? extends AssetType, ? extends GenericArtifact, ? extends BehaviorQualifier> controlRecord)  {
		this.controlRecord = controlRecord;
		this.bianServiceInfo =  new BianServiceInfo(getServiceDomain(), getFunctionalPattern(), getControlRecord());
	}
	
	public Class<?> getRequestDtoClass(ServiceOperation serviceOperation) { return BianApiRequest.class; }
	public Class<?> getResponseDtoClass(ServiceOperation serviceOperation) { return BianApiResponse.class; }
	public Class<?> getEntityClass() { return this.controlRecord.getClass(); }
	public Class<?> getDAOClass() { return null; }
	public Object initializeRequestDto(String action, String referenceId) {
		return new BianApiRequest(action, null, referenceId);
	}
	
	@Controller
	@EnableConfigurationProperties(ServiceProperties.class)
	public class BianServiceStatusController {
		@RequestMapping(value="/status", method=RequestMethod.GET)
		@ApiOperation(value="Retrieve service status details", 
	    		notes="This endpoint fetches details about the status of the service."
	    				+ "It returns a JSON object with service status details.",
	    		produces="application/json")
		@ApiResponses(value= {
				@ApiResponse(code=200, message="Successful Status Operation", 
			     response=ServiceStatus.class),	
				@ApiResponse(code=500, message="Internal server error.")
		})
		public @ResponseBody ServiceStatus getStatus() {
			return new ServiceStatus(serviceProperties.getStatus(), serviceProperties.getConfigSource());
		}		
		@RequestMapping(value="/bianinfo", method=RequestMethod.GET)
		@ApiOperation(value="Retrieve BIAN service details", 
	    		notes="This endpoint retrieves details about the BIAN service."
	    				+ "It returns a JSON object with BIAN-specific service information.",
	    		produces="application/json")
		@ApiResponses(value= {
				@ApiResponse(code=200, message="Successful Info Operation", 
			     response=ServiceStatus.class),	
				@ApiResponse(code=500, message="Internal server error.")
		})
		public @ResponseBody BianServiceInfo getBianInfo() {
			return bianServiceInfo;
		}		
	}
	
	@RequestMapping(value = "", params = "action")
	public @ResponseBody ResponseEntity<?> processServiceOperation(@RequestParam String action, @RequestBody(required=false) Map<String, Object> request) {
		ServiceOperation serviceOperation = ServiceOperation.lookupByName(action.toUpperCase());
		if (serviceOperation == null) {
			throw new IllegalServiceOperationException(action);
		}
		Object requestDto = initializeRequestDto(action, null);
		modelMapper.map(request, requestDto);
		
		Object responseDto = null;
		switch (serviceOperation) {
		case ACTIVATE:
			responseDto = doActivate(requestDto);
			break;
		case AUTHORIZE:
			responseDto = doAuthorize(requestDto);
			break;
		case CONFIGURE:
			responseDto = doConfigure(requestDto);
			break;
		case CREATE:
			responseDto = doCreate(requestDto);
			break;
		case EVALUATE:
			responseDto = doEvaluate(requestDto);
			break;
		case EXECUTE:
			responseDto = doExecute(requestDto);
			break;
		case INITIATE:
			responseDto = doInitiate(requestDto);
			break;
		case NOTIFY:
			responseDto = doNotify(requestDto);
			break;
		case PROVIDE:
			responseDto = doProvide(requestDto);
			break;
		case RECORD:
			responseDto = doRecord(requestDto);
			break;
		case REGISTER:
			responseDto = doRegister(requestDto);
			break;
		case REQUEST:
			responseDto = doRequest(requestDto);
			break;
		case RETRIEVE:
			responseDto = doRetrieve(requestDto);
			break;
		case TERMINATE:
			responseDto = doTerminate(requestDto);
			break;
		case UPDATE:
			responseDto = doUpdate(requestDto);
			break;
		}
		return ResponseEntity.ok(responseDto);
	}
	
	@RequestMapping(value = "/{refId}", method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> processGet(@PathVariable String refId, @RequestBody(required=false) Map<String, Object> request) {
		if (request == null) request = new HashMap<>();
		if (!request.containsKey("referenceId")) request.put("referenceId", refId);
		return processServiceOperation("retrieve", request);
	}

	@RequestMapping(value = "", method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> processPost(@RequestBody(required=false) Map<String, Object> request) {
		if (request == null) request = new HashMap<>();
		return processServiceOperation("create", request);
	}

	@RequestMapping(value = "/{refId}", method=RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> processPut(@PathVariable String refId, @RequestBody(required=false) Map<String, Object> request) {
		if (request == null) request = new HashMap<>();
		if (!request.containsKey("referenceId")) request.put("referenceId", refId);
		return processServiceOperation("update", request);
	}

	@RequestMapping(value = "/{refId}", method=RequestMethod.PATCH)
	public @ResponseBody ResponseEntity<?> processPatch(@PathVariable String refId, @RequestBody(required=false) Map<String, Object> request) {
		if (request == null) request = new HashMap<>();
		if (!request.containsKey("referenceId")) request.put("referenceId", refId);
		return processServiceOperation("update", request);
	}

	@RequestMapping(value = "/{refId}", method=RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> processDelete(@PathVariable String refId, @RequestBody(required=false) Map<String, Object> request) {
		if (request == null) request = new HashMap<>();
		if (!request.containsKey("referenceId")) request.put("referenceId", refId);
		return processServiceOperation("terminate", request);
	}

	public abstract String getServiceDomain();
	public abstract String getFunctionalPattern();
	public abstract Object doActivate(Object request);
	public abstract Object doAuthorize(Object request);
	public abstract Object doConfigure(Object request);
	public abstract Object doCreate(Object request);
	public abstract Object doEvaluate(Object request);
	public abstract Object doExecute(Object request);
	public abstract Object doInitiate(Object request);
	public abstract Object doNotify(Object request);
	public abstract Object doProvide(Object request);
	public abstract Object doRecord(Object request);
	public abstract Object doRegister(Object request);
	public abstract Object doRequest(Object request);
	public abstract Object doRetrieve(Object request);
	public abstract Object doTerminate(Object request);
	public abstract Object doUpdate(Object request);
}
