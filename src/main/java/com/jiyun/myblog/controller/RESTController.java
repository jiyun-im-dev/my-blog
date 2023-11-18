package com.jiyun.myblog.controller;

import org.springframework.web.bind.annotation.*;

// CRUD 처리용 컨트롤러
@RestController // 메서드가 반환한 데이터를 자동으로 JSON 타입으로 변환
public class RESTController {

	// GET: SELECT
	@GetMapping("/my-blog")
	public String httpGet() {
		return "GET 요청 처리";
	}

	// POST: INSERT
	@PostMapping("/my-blog")
	public String httpPost() {
		return "POST 요청 처리";
	}

	// PUT: UPDATE
	@PutMapping("/my-blog")
	public String httpPut() {
		return "PUT 요청 처리";
	}

	// DELETE: DELETE
	@DeleteMapping("/my-blog")
	public String httpDelete() {
		return "DELETE 요청 처리";
	}

}
