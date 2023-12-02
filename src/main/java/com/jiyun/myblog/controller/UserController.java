package com.jiyun.myblog.controller;

import com.jiyun.myblog.domain.RoleType;
import com.jiyun.myblog.domain.User;
import com.jiyun.myblog.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user/get/{id}")
	// 요청 URL에 포함된 id 정보를 파라미터에 할당
	public @ResponseBody User getUser(@PathVariable int id) {
		return userRepository.findById(id).get();
	}

	// 테스트를 위해 서비스 객체가 아닌 컨트롤러에서 리포지터리 사용
	@PostMapping("/user")
	// JSON으로 전달된 회원 정보를 User 객체로 받음
	public @ResponseBody String insertUser(@RequestBody User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return user.getUsername() + "회원가입 성공";
	}

}
