package com.rest.ex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.ex.pojo.TestDto;

@RestController
public class TestController {

	@RequestMapping(value ="/test", method = RequestMethod.GET)
	public TestDto getTestJsonObject() {
		TestDto t = new TestDto();
		t.setId(123);
		t.setThing("cheese");
		return t;
	}
	
}
