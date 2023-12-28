package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringWorldController {
	
/*
  	post
	put
	post
	delete
	get
 */
	//get http-method
	//http://localhost:8080/spring-world
	
	@GetMapping("/spring-world")
	public String springworld() {
	return	"Hello Spring World!!!";
	}

}
