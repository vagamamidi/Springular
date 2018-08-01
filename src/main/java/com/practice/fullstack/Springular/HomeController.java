package com.practice.fullstack.Springular;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String welcome() {
		return "WELCOME";
	}
}
