package com.FirstProject.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld{
	@GetMapping("/hello")
	public String getHello(@PathParam("name") String name)
	{
		return "Hello World "+name;
	}
	
}