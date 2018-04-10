package io.pivotal.spring.bian.model.dto;

public class BianApiRequest {
	private String action;
	private String behaviorQualifier;
	private String referenceId;

	public BianApiRequest() {
		
	}
	
	public BianApiRequest(String action, String behaviorQualifier, String referenceId) {
		super();
		this.action = action;
		this.behaviorQualifier = behaviorQualifier;
		this.referenceId = referenceId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getBehaviorQualifier() {
		return behaviorQualifier;
	}

	public void setBehaviorQualifier(String behaviorQualifier) {
		this.behaviorQualifier = behaviorQualifier;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
}
