package com.app;

import java.net.URI;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.app.controller.TestController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestRestController {

	@LocalServerPort
	int randomServerPort;

	@InjectMocks
	private TestController testController;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void helloMsgTests() throws Exception {

		final String baseUrl = "http://localhost:" + randomServerPort + "/sample/hello";
		URI uri = new URI(baseUrl);

		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

		System.out.println("Response Code :: " + result.getStatusCodeValue());
		Assert.assertEquals(200, result.getStatusCodeValue());
		System.out.println("Response Body :: " + result.getBody());
		Assert.assertEquals(true, result.getBody().contains("Hello World !"));
	}
}