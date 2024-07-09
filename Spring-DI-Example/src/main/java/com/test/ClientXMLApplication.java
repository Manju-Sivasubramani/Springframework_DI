package com.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.comsumer.MYXMLApplication;

public class ClientXMLApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		MYXMLApplication app=context.getBean(MYXMLApplication.class);
		
		app.processMessage("Hi Manju","manju@gmail.com");
		
		context.close();
	}
}
