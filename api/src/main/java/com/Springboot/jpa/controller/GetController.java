package com.Springboot.jpa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.jpa.dto.MemberDto;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
		return "Hello World";
	}
	@GetMapping(value="/name")
	public String getName() {
		return "Flature";
	}
	@GetMapping(value="/variable1/{variable}")
	public String getVariable1(@PathVariable String variable) {
		return variable;
	}
	@GetMapping(value="/variablle2/{variable}")
	public String getVariable2(@PathVariable("variable")String var) {
		return var;
	}
	@GetMapping(value="/reuqest1")
	public String getRequestParam1(@RequestParam String name,@RequestParam String email,@RequestParam String organization) {
		return name
				+" "+email+" "+organization;
	}
	@GetMapping(value="/request2")
	public String getRequestParam2(@RequestParam Map<String, String> param) {
		StringBuilder sb=new StringBuilder();
		
		param.entrySet().forEach(map->{
			sb.append(map.getKey()+" : "+map.getValue()+"\n");
		});
		return sb.toString();
	}
	@GetMapping(value="/reuqest3")
	public String getReqeustParam3(MemberDto memberDto) {
		return memberDto.toString();
		
	}
}
