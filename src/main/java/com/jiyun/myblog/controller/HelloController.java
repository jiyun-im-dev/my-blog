package com.jiyun.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/html")
	public String html() {
		System.out.println("HTML 파일 요청됨");
		return "redirect:hello.html";
	}

	@GetMapping("/image")
	public String image() {
		System.out.println("image 파일 요청됨");
		return "redirect:image/hanji.png";
	}

}
