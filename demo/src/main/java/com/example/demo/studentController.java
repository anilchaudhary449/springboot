package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody  ---instead of these two use 
@RestController
public class studentController {
	
	//http://localhost:8080/student
	
	
	@GetMapping("/student")
	public Student getStudent() { //java rest api which returns java bean/object to client
		return new Student("Anil","Chaudhary");
	}
	
	@GetMapping("/students")
	public List<Student> getStudent1(){
		List<Student> student1=new ArrayList<>();
		student1.add(new Student("Anil","Chaudhary"));
		student1.add(new Student("Banil","Chaudhary"));
		student1.add(new Student("Canil","Chaudhary"));
		
		return student1;
	}
	
	//http://localhost:8080/student/Anil/Chaudhary
	//@PathVariable annotation
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}

	
	//build a rest API to handle query parameters
	//http://localhost:8080/student/query?firstName=Ramesh&lastName=Chaudhary
	@GetMapping("/student/query")
	public Student studentQueryPara(@RequestParam(name="firstName")String firstName, @RequestParam(name="lastName") String lastName) {
		return new Student(firstName,lastName);
		
	}
}
