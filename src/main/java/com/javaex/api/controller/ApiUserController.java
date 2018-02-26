package com.javaex.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaex.service.UserService;

@Controller
public class ApiUserController {

	@Autowired
	private UserService userService;
	
	//id중복체크 : 회원가입시 검사
	@ResponseBody
	@RequestMapping(value="/api/user/idcheck", method=RequestMethod.POST)
	public boolean cateList(String id) { //id만 검사할꺼니깐 id하나만 받아오기

		return userService.idCheck(id);
	}
}