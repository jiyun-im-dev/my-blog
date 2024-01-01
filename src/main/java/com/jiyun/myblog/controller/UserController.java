package com.jiyun.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/auth/insertUser")
	public String insertUser() {
		return "/user/insertUser";
	}

}
