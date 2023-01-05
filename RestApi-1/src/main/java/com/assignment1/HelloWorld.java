package com.assignment1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
	@RequestMapping("/{name}")
	public String helloWorld() {
		return "Hello World";
}
}
