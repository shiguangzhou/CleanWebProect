package com.abchina.testcxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class HelloWorldServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient("http://localhost:8080/cxftest/services/HelloService?wsdl");
		try {
			Object[] result = client.invoke("sayHello", "shiguangzhou");
			for(Object o : result) {
				// ����ֵΪ�ַ���ʱ
				System.out.println(o.toString());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
