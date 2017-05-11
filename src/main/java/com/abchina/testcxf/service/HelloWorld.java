package com.abchina.testcxf.service;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService
//@Service
public interface HelloWorld {
	
	public String sayHello();
}
