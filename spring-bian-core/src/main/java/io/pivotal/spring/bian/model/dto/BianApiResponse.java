package io.pivotal.spring.bian.model.dto;

public class BianApiResponse {
	private long executionTimestamp;
	private BianApiRequest request;

	public long getExecutionTimestamp() {
		return executionTimestamp;
	}

	public void setExecutionTimestamp(long executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
	}

	public BianApiRequest getRequest() {
		return request;
	}

	public void setRequest(BianApiRequest request) {
		this.request = request;
	}
}
