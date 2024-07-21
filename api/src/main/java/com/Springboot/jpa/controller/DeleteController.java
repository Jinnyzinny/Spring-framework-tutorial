package com.Springboot.jpa.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.jpa.dto.MemberDto;

@RestController
@RequestMapping("/api/v1/delte-api")
public class DeleteController {
	@DeleteMapping(value="/{variable}")
	public String DeleteVariable(@PathVariable String variable) {
		return variable;
	}
	
	@DeleteMapping(value="/request1")
	public String getReqeustParam1(@RequestParam String email) {
		return "e-mail : "+ email;			
	}
}
