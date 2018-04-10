package io.pivotal.spring.bian.model.dto;

public class IfxApiRequest extends BianApiRequest {
	private String rqUID;
	
	public IfxApiRequest() {
		super();
	}
	
	public IfxApiRequest(String rqUID) {
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
