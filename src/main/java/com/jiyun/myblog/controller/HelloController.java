package com.jiyun.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		return "redirect:image/hange.png";
	}

	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("JSP 파일 요청됨");
		model.addAttribute("username", "지윤");
		return "hello"; // applications.yml 설정으로 인해 .jsp 확장자 생략
	}

}
