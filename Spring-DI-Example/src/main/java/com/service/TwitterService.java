package com.service;

public class TwitterService implements MessageService {
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Send to"+rec+" with Message="+msg);
		return true;
}
}
