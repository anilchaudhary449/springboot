package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody  ---instead of these two use 
@RestController
public class studentController {
	
	//http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Anil","Chaudhary");
	}

}
