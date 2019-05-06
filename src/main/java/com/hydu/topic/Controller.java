package com.hydu.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="rabbit")
public class Controller {
	
	@Autowired
	private Sender sender;

	@Autowired
	private Sender2 sender2;
	
	
	
	@PostMapping("sendermost")
	public void hello() {
		sender.send();
//		sender2.send();
	}
	
	@PostMapping("sendermost2")
	public void hello2() {
//		sender.send();
		sender2.send();
	}
}
