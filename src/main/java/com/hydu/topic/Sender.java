package com.hydu.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	
		public void send() {
			String str="hello i am heyong";
			System.out.println("send:"+str);
			this.amqpTemplate.convertAndSend("exchange", "topic.message",str);		
		}
}
