package com.jiyun.myblog.persistence;

import com.jiyun.myblog.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// 비즈니스 컴포넌트의 실질적인 DB 연동은 DAO 클래스에서 담당
// UserMapper 인터페이스 이용하여 회원 정보를 관리하는 DAO
@Repository
public class UserDao {

	// 스프링과 마이바티스를 연동하기 위해서 SqlSessionFactoryBean 객체와
	// SqlSessionTemplate 객체가 필요
	// 두 객체를 생성하는 환경 설정 클래스는 스프링 부트에 기본적으로 포함되어 있음
	@Autowired
	private SqlSessionTemplate mybatis;

	// SqlSessionTemplate 객체에 대한 의존성이 처리되면
	// 이 객체가 제공하는 insert(), update(), delete() 등의 메서드 이용 가능
	public void insertUser(User user) {
		mybatis.insert("insertUser", user);
	}

	public void updateUser(User user) {
		mybatis.update("insertUser", user);
	}

	public void deleteUser(User user) {
		mybatis.delete("insertUser", user);
	}

	// 메서드 사용 시 실행할 SQL은 UserMapper 인터페이스에 등록한 메서드명으로 식별
	public User getUser(User user) {
		return mybatis.selectOne("getUser", user);
	}

	public List<User> getUserList() {
		return mybatis.selectList("getUserList");
	}

}
