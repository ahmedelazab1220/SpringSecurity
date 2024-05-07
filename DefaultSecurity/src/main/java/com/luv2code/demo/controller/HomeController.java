package com.luv2code.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class HomeController {

	@GetMapping("")
	public String demo() {
		return "Hi EveryBody!";
	}
	
}
