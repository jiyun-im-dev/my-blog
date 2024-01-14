package com.jiyun.myblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> { // 제네릭 클래스

	private int status; // HTTP 응답 상태 코드

	private T data; // 실제 응답 데이터

}
