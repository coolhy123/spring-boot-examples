package com.hydu.config;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hydu.entity.User;

@Component
public class HelloSender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void send() {
		String sendMsg = "hello1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.amqpTemplate.convertAndSend("helloQueue", sendMsg);
	}
	
	
	public void sendMany() {
		String sendMsg="toMany"+new Date();
		
		for(int i=0;i<30;i++) {
			this.amqpTemplate.convertAndSend("tomany",sendMsg+"   "+"tomany"+i);
		}
		
	}
	
	public void sendObject(User user) {
		
		
		System.out.println("sendUser:"+user.toString());
			this.amqpTemplate.convertAndSend("toObject",user);
	
		
	}
}
