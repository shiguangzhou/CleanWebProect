package com.abchina.testcxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

//@WebService(targetNamespace="http://impl.service.testcxf.abchina.com/")
//@Service
@WebService
public interface HelloWorld {
//	@WebMethod
	public String sayHello(String text);
}
