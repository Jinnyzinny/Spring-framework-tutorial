package com.Springboot.jpa.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.jpa.dto.MemberDto;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
	@PutMapping(value="/member")
	public String postMember(@RequestBody Map<String,Object>putData) {
		StringBuilder sb=new StringBuilder();
		putData.entrySet().forEach(map->{
			sb.append(map.getKey()+" : "+map.getValue()+"\n");
		});
		return sb.toString();
	}	
	@PutMapping(value="/member1")
	public String postMemberDto1(@RequestBody MemberDto memberDto) {
		return memberDto.toString();
		
	}
	@PutMapping(value="/member2")
	public MemberDto postMemberDto2(@RequestBody MemberDto memberDto) {
		return memberDto;
	}
}