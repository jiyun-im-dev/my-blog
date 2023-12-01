package com.jiyun.myblog.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

// USERS 테이블과 매핑할 도메인 클래스
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {

	@Id // 기본키
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 1에서 시작해 1씩 증가
	private int id; // 회원 일련번호

	@Column(nullable = false, length = 50, unique = true)
	private String username;

	@Column(length = 100)
	private String password;

	@Column(nullable = false, length = 100)
	private String email;

	@Enumerated(EnumType.STRING) // 열거형의 값을 저장하도록 명시(인덱스 저장 방지)
	private RoleType role;

	@CreationTimestamp // 현재 시간이 기본값으로 등록됨
	private Timestamp createDate;

}
