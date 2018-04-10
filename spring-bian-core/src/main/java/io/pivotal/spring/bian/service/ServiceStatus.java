package io.pivotal.spring.bian.service;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class ServiceStatus {
	@ApiModelProperty(value="The status of the service, 'online' if running normally")
	private final String status;
	@ApiModelProperty(value="The source of the configuration properties")
	private final String configSource;
	
	public ServiceStatus() {
		status = "";
		configSource = "";
	}

	public ServiceStatus(String status, String configSource) {
		this.status = status;
		this.configSource = configSource;
	}

	public String getStatus() {
		return status;
	}

	public String getConfigSource() {
		return configSource;
	}
}
