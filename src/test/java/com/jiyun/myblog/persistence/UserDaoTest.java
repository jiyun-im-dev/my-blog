package com.jiyun.myblog.persistence;

import com.jiyun.myblog.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoTest {

	@Autowired
	private UserDao userDao;

	// H2 DB의 USERS 테이블은 테스트를 위해 미리 생성해 둠
	@Test
	void getUserList() {
		User user = new User();
		user.setUsername("test");
		user.setPassword("testpwd");
		user.setEmail("test@gmail.com");

		int before = userDao.getUserList().size();
		userDao.insertUser(user);
		int after = userDao.getUserList().size();

		assertEquals(before + 1, after);
	}
}