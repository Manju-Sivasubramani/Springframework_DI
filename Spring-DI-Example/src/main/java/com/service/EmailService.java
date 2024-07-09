package com.service;

public class EmailService implements MessageService {
public boolean sendMessage(String msg, String rec) {
	System.out.println("Email Send to"+rec+" with Message="+msg);
	return true;
}
}
