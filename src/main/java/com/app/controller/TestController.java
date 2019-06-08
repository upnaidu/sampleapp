/**
 * 
 */
package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pentayya.u
 *
 */
@RestController
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@GetMapping("/msg")
	public String msg() {
		logger.info("Inside msg() method ");
		return "Hello World !";
	}

}
