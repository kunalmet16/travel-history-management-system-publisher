package com.rabbitmqTravel.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmqTravel.dto.Travel;
import com.rabbitmqTravel.dto.UserLogin;
import com.rabbitmqTravel.config.MessageConfig;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Publisher {

	@Autowired
    RabbitTemplate template;
	
	@PostMapping("/users/{username}/travels")
	public boolean addRabbitTravel(@RequestBody Travel travel,@PathVariable("username") String username)
	{
		travel.setUserlogin(new UserLogin(username,""));
		template.convertAndSend(MessageConfig.EXCHANGE, MessageConfig.ROUTING_KEY, travel);
		return true;
	}
}

