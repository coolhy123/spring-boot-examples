package com.hydu.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="tomany")
public class ManyCostom {
	@RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver1  : " + hello);
    }
}
