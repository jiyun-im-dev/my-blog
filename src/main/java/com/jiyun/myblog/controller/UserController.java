package com.jiyun.myblog.controller;

import com.jiyun.myblog.domain.RoleType;
import com.jiyun.myblog.domain.User;
import com.jiyun.myblog.exception.MyBlogException;
import com.jiyun.myblog.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user/get/{id}")
	// 요청 URL에 포함된 id 정보를 파라미터에 할당
	public @ResponseBody User getUser(@PathVariable int id) {
		// 검색된 회원이 없을 경우 예외 반환
		// 추상 메서드가 하나만 있는 인터페이스는 람다식으로 표현 가능
		return userRepository.findById(id).orElseThrow(
				() -> new MyBlogException(id + "번 회원이 없습니다."));
	}

	@GetMapping("/user/list")
	public @ResponseBody List<User> getUserList() {
		return userRepository.findAll();
	}

	@GetMapping("/user/page/{page}")
	public @ResponseBody Page<User> getUserListPaging(@PathVariable int page) {
		// page 파라미터에 해당하는 2개(=pageSize)의 데이터 조회
		// id와 username 내림차순 정렬
		Pageable pageable = PageRequest.of(page, 2, Sort.Direction.DESC, "id", "username");
		return userRepository.findAll(pageable);
	}

	// 테스트를 위해 서비스 객체가 아닌 컨트롤러에서 리포지터리 사용
	@PostMapping("/user")
	// JSON으로 전달된 회원 정보를 User 객체로 받음
	public @ResponseBody String insertUser(@RequestBody User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return user.getUsername() + "회원가입 성공";
	}

	@Transactional // 원래는 서비스 클래스에서 리포지토리를 호출하고 서비스 메서드에 어노테이션 적용해야 함
	@PutMapping("/user")
	public @ResponseBody String updateUser(@RequestBody User user) {
		User findUser = userRepository.findById(user.getId()).orElseThrow(() -> {
			return new MyBlogException(user.getId() + "번 회원이 없습니다.");
		});
		findUser.setUsername(user.getUsername());
		findUser.setPassword(user.getPassword());
		findUser.setEmail(user.getEmail());
		return user.getId() + "번 회원 정보 수정 완료";
	}

	@DeleteMapping("/user/{id}")
	public @ResponseBody String deleteUser(@PathVariable int id) {
		userRepository.deleteById(id);
		return id + "번 회원 삭제됨";
	}

}
