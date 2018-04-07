package com.example.controller;

import com.example.mybatis.domain.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

	@Autowired
	IUserService userService;

	@RequestMapping("/save")
	public String saveUser(User user){

		userService.saveUser(user);

		return "ok";
	}

}
