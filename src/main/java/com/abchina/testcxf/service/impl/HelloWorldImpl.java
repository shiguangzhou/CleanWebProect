package com.abchina.testcxf.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abchina.testcxf.service.HelloWorld;

//@Service
//@WebService(targetNamespace="http://impl.service.testcxf.abchina.com/")
@WebService
@Component
public class HelloWorldImpl implements HelloWorld {

	@WebMethod
	public String sayHello(String text) {
		return "helloworld" + text;
	}
	
	public HelloWorldImpl(){};

}
