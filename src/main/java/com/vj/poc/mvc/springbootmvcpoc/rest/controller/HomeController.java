package com.vj.poc.mvc.springbootmvcpoc.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vijai.kumar
 *
 */
@RestController
public class HomeController {

	@RequestMapping("/home")
	public String customerInformation() {
		return "Hey, I am from external tomcat";
	}

}
