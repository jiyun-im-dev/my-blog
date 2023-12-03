package com.jiyun.myblog.exception;

import java.io.Serial;

// Exception 클래스를 상속해도 되지만
// RuntimeException 클래스를 상속하여 Unchecked 예외 클래스로 작성
public class MyBlogException extends RuntimeException{

	@Serial
	private static final long serialVersionUID = 1L;

	public MyBlogException(String message) {
		super(message);
	}

}
