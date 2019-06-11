package com.app;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TestRestController.class)
public class SampleappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void helloMsgTests() throws Exception {
		this.mockMvc.perform(get("/hello")).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello World !")));
	}
}
