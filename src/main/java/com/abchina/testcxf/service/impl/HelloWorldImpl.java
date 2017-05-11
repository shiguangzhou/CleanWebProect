package com.abchina.testcxf.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abchina.testcxf.service.HelloWorld;

// �����ע��ֻ����Component����������Service��
@Service
@WebService
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello() {
		return "helloworld";
	}
	
	public HelloWorldImpl(){};

}
