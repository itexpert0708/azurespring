package com.example.azurespring.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class HelloController {
	 @RequestMapping(value="/home", method=RequestMethod.GET)
	 public String index() {
		return "Hello World with Spring Boot";
	 }

}
