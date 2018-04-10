package io.pivotal.spring.bian.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.Property;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.dto.BianApiRequest;
import io.pivotal.spring.bian.model.dto.BianApiResponse;
import io.pivotal.spring.bian.model.genericartifact.GenericArtifact;
import io.pivotal.spring.bian.service.BianServiceController;

@RunWith(SpringRunner.class)
@SpringBootTest()
@AutoConfigureMockMvc
public class BianServiceTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	static final Logger logger = LoggerFactory.getLogger(BianServiceTests.class);

	@Test
	public void testServiceShouldReturnLocalConfig() throws Exception {
		this.mockMvc.perform(get("/status").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk())
			.andExpect(jsonPath("$.status").value("online"))
			.andExpect(jsonPath("$.configSource").value("local"));
	}
	
	@Test
	public void testServiceShouldReturnExceptionForBadServiceOperation() throws Exception {
		this.mockMvc.perform(get("/v1/test?action=badaction").accept(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isBadRequest())
			.andExpect(jsonPath("$.status").value("BAD_REQUEST"));
	}

	@SpringBootApplication
	static class TestConfiguration {
		public class TestControlRecord extends ControlRecord<AssetType, GenericArtifact, Property> {
			public TestControlRecord(AssetType assetType, GenericArtifact genericArtifact, Property behaviorQualifier) {
				super(assetType, genericArtifact, behaviorQualifier);
			}
		}
		
		@RestController
		@RequestMapping("/v1/test")
		public class TestServiceController extends BianServiceController {

			@Override
			public String getServiceDomain() {
				return "Test Service";
			}

			@Override
			public String getFunctionalPattern() {
				return "Test Functional Pattern";
			}

			@Override
			public Object doActivate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doAuthorize(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doConfigure(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doCreate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doEvaluate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doExecute(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doInitiate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doNotify(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doProvide(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doRecord(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doRegister(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doRequest(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doRetrieve(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doTerminate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object doUpdate(Object request) {
				// TODO Auto-generated method stub
				return null;
			}
		}
	}
}
