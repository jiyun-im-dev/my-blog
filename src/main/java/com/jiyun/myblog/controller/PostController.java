package com.jiyun.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

	// 인덱스 페이지를 웹 앱의 기본 화면으로 설정
	@GetMapping({"", "/"})
	public String getPostList() {
		return "index";
	}

}
