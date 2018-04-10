package io.pivotal.spring.bian.service;

import io.pivotal.spring.bian.model.assettype.AssetType;
import io.pivotal.spring.bian.model.behaviorqualifier.BehaviorQualifier;
import io.pivotal.spring.bian.model.controlrecord.ControlRecord;
import io.pivotal.spring.bian.model.genericartifact.GenericArtifact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class BianServiceInfo {
	@ApiModelProperty(value="The BIAN service domain name")
	private final String serviceDomain;
	@ApiModelProperty(value="The BIAN asset type managed by the service")
	private final String assetType;
	@ApiModelProperty(value="The BIAN functional pattern of the service")
	private final String functionalPattern;
	@ApiModelProperty(value="The BIAN generic artifiact type of the service domain control record")
	private final String genericArtifact;
	@ApiModelProperty(value="The control record name used by the service to track state")
	private final String controlRecord;
	@ApiModelProperty(value="The BIAN behavior qualifier type for the service")
	private final String behaviorQualifierType;

	public BianServiceInfo(String serviceDomain, String assetType, String functionalPattern, String genericArtifact,
			String behaviorQualifierType) {
		super();
		this.serviceDomain = serviceDomain;
		this.assetType = assetType;
		this.functionalPattern = functionalPattern;
		this.genericArtifact = genericArtifact;
		this.controlRecord = assetType + genericArtifact;
		this.behaviorQualifierType = behaviorQualifierType;
	}

	public BianServiceInfo(String serviceDomain, String functionalPattern, ControlRecord<? extends AssetType, ? extends GenericArtifact, ? extends BehaviorQualifier> controlRecord) {
		super();
		this.serviceDomain = serviceDomain;
		this.functionalPattern = functionalPattern;
		this.assetType = controlRecord != null ? controlRecord.getAssetType() : "undefined";
		this.genericArtifact = controlRecord != null ? controlRecord.getGenericArtifactType() : "undefined";
		this.behaviorQualifierType = controlRecord != null ? controlRecord.getBehaviorQualifierType() : "undefined";
		this.controlRecord = controlRecord != null ? controlRecord.getAssetType() + controlRecord.getGenericArtifactType() : "undefined";
	}
	
	public String getServiceDomain() {
		return serviceDomain;
	}

	public String getAssetType() {
		return assetType;
	}

	public String getFunctionalPattern() {
		return functionalPattern;
	}

	public String getGenericArtifact() {
		return genericArtifact;
	}

	public String getControlRecord() {
		return controlRecord;
	}

	public String getBehaviorQualifierType() {
		return behaviorQualifierType;
	}

}
