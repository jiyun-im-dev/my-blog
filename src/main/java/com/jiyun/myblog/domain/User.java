package com.jiyun.myblog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 도메인 클래스: 유저
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	private int id; // 회원 일련번호
	private String username;
	private String password;
	private String email;

}
