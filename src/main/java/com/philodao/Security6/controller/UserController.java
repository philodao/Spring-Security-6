package com.philodao.Security6.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequiredArgsConstructor
public class UserController {

	@GetMapping("/login")
	public String alogin() {
		
		return "login";		
	}
}
