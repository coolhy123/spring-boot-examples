package com.hydu.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListeners;
import org.springframework.stereotype.Component;

import com.hydu.entity.User;

@Component
@RabbitListener(queues= "toObject")
public class UserCostom {

	
	@RabbitHandler
	public void process(User obj) {
		System.out.println("user:"+obj.toString());
	}
	
	@RabbitHandler
	public void process2(String str) {
		System.out.println("str:"+str);
	}
}
