package com.hydu.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender2 {

	@Autowired
	private AmqpTemplate amqpTemplate;
	public void send () {
		String str="hello I'm haha";
		System.out.println("sender2:"+str);
		this.amqpTemplate.convertAndSend("exchange", "topic.messages",str);
	}
}
