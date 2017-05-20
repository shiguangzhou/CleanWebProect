package com.abchina.testcxf.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abchina.testcxf.service.HelloWorld;

//@Service
//@WebService(targetNamespace="http://impl.service.testcxf.abchina.com/")
@WebService
@Component
public class HelloWorldImpl implements HelloWorld {
	private static final Log log = LogFactory.getLog(HelloWorldImpl.class);
	
	@WebMethod
	public String sayHello(String text) {
		log.info("log helloworld " + text + "\t" +  log.getClass());
		return "helloworld" + text;
		
	}
	
	public HelloWorldImpl(){};

}
