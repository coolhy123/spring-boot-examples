package com.hydu.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="topic.message")
public class CostomMessage {
	
	@RabbitHandler
	public void process(String str) {
		
		System.out.println("message=="+str);
	}
	
}
