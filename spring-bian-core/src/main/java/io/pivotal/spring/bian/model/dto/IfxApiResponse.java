package io.pivotal.spring.bian.model.dto;

public class IfxApiResponse extends BianApiResponse {
	String rqUID;

	public IfxApiResponse() {
		super();
	}
	
	public IfxApiResponse(String rqUID) {
		super();
		this.rqUID = rqUID;
	}

	public String getRqUID() {
		return rqUID;
	}
	public void setRqUID(String rqUID) {
		this.rqUID = rqUID;
	}
}
