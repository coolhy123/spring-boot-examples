package com.hydu.config;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSenderTwo {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send() {
			String sendMsg="toMany"+new Date();
		
		for(int i=0;i<30;i++) {
			this.amqpTemplate.convertAndSend("hello",sendMsg+"   "+"hello"+i);
		}
		
	}
}
