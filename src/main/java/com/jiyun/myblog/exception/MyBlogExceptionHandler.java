package com.jiyun.myblog.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class MyBlogExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String globalExceptionHandler(Exception e) {
		// 애플리케이션에서 발생한 모든 예외를 받아서 HTML 메시지로 변환
		return "<h1>" + e.getMessage() + "</h1>";
	}

}
