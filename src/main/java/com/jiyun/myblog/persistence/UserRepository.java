package com.jiyun.myblog.persistence;

import com.jiyun.myblog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	// 스프링에서 JPQL을 쉽게 사용할 수 있게끔 제공하는 쿼리 메서드
	Optional<User> findByUsername(String username);

}
