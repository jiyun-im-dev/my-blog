package com.jiyun.myblog.controller;

import com.jiyun.myblog.domain.User;
import org.springframework.web.bind.annotation.*;

// CRUD 처리용 컨트롤러
@RestController // 메서드가 반환한 데이터를 자동으로 JSON 타입으로 변환
public class RESTController {

	// GET: SELECT
	@GetMapping("/my-blog")
	public User httpGet() {
		User findUser = User.builder()
				.id(1)
				.username("soohyuni")
				.password("1018")
				.email("soohyuni@gmail.com")
				.build();
		return findUser;
	}

	// POST: INSERT
	@PostMapping("/my-blog")
	public String httpPost(@RequestBody User user) {
		return "POST 요청 처리 입력값: " + user.toString();
	}

	// PUT: UPDATE
	@PutMapping("/my-blog")
	public String httpPut(@RequestBody User user) {
		return "PUT 요청 처리 입력값: " + user.toString();
	}

	// DELETE: DELETE
	@DeleteMapping("/my-blog")
	public String httpDelete(@RequestParam int id) {
		return "DELETE 요청 처리 입력값: " + id;
	}

}
