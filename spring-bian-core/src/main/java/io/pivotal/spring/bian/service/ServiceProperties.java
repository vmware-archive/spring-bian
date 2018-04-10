package io.pivotal.spring.bian.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties(prefix = "bianservice")
@RefreshScope
public class ServiceProperties {

	private String status = "online";
	private String configSource = "default";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getConfigSource() {
		return configSource;
	}

	public void setConfigSource(String configSource) {
		this.configSource = configSource;
	}
}
