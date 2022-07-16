package com.DockerWithoutFileSpringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

	@GetMapping("getMessage")
	public String getMessage() {
		
		return "Hello, I am showinganothe project";
	}
}
