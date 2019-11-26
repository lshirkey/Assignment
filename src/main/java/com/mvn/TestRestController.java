package com.mvn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@GetMapping
	public String hello() {
		return "Test First Commit";
	}
}
