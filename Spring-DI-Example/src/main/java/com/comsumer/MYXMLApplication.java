package com.comsumer;

import com.service.MessageService;

public class MYXMLApplication {
	private MessageService service;


	public void setService(MessageService svc) {
		this.service = svc;
	}
	public boolean processMessage(String msg,String rec) {
		return this.service.sendMessage(msg,rec);
	}
	

}
