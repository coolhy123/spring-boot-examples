package com.hydu.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="hello")
public class ManyToManyCostom {
	
	@RabbitHandler
	public void perocess(String str) {
		System.out.println("Receiver2:"+str);
	}

}
