package com.jiyun.myblog.controller;

import com.jiyun.myblog.domain.RoleType;
import com.jiyun.myblog.domain.User;
import com.jiyun.myblog.exception.MyBlogException;
import com.jiyun.myblog.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

	@GetMapping("/auth/insertUser")
	public String insertUser() {
		return "/user/insertUser";
	}

}
