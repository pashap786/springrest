package com.rest.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.ex.pojo.TestDto;
import com.rest.ex.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepo;
	
	public TestDto getTestDto() {
		
		return null;
		
	}

}
