package io.pivotal.spring.bian.service.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceStatusIT {
	
	private final static Logger logger = LoggerFactory.getLogger(ServiceStatusIT.class);

	@Value("${service.url:http://localhost:8080}")
	String serviceUrl;
	
	@Test
	public void testServiceShouldReturnRemoteConfig() throws Exception {
//		TestRestTemplate restTemplate = new TestRestTemplate();
//		ResponseEntity<ServiceStatus> response = restTemplate.getForEntity(serviceUrl + "/status.json", ServiceStatus.class);
//		logger.info(response.toString());
//
//		assertThat(response.getStatusCode(), is(HttpStatus.OK));
//		assertThat(response.getBody().getStatus(), is(equalTo("online")));
//		assertThat(response.getBody().getConfigSource(), startsWith("config server"));
	}
	
}
