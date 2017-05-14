package com.abchina.testcxf.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

//@WebService(targetNamespace="http://impl.service.testcxf.abchina.com/")
//@Service
// 不要在接口中标记WebService注解，否则客户端不能够正常访问wsdl
//@WebService
public interface HelloWorld {
//	@WebMethod
	public String sayHello(String text);
}
