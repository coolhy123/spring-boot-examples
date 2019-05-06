package com.hydu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hydu.config.HelloSender;
import com.hydu.config.HelloSenderTwo;
import com.hydu.entity.User;

@RestController
@RequestMapping("/rabbit")
public class RabbitMqController {


	    
	    @Autowired
	    private HelloSender helloSender;
	  
	    @Autowired
	    private HelloSenderTwo helloSenderTwo;
	    
	    @PostMapping("/hello")
	    public void hello() {
	    	helloSender.send();
	    }
	    
	    @PostMapping("/hello2")
	    public void hello2() {
	    	helloSender.sendMany();
	    	helloSenderTwo.send();
	    }
	    
	    
	    @RequestMapping(value="/user",method=RequestMethod.POST)
	    @ResponseBody
	    public void getUser(@RequestBody User user) {
	    	helloSender.sendObject(user);;
	    }
}
