package com.jiyun.myblog.service;

import com.jiyun.myblog.domain.RoleType;
import com.jiyun.myblog.domain.User;
import com.jiyun.myblog.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void insertUser(User user) {
		user.setRole(RoleType.USER);
		userRepository.save(user);
	}

}
