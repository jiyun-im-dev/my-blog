package com.jiyun.myblog.mapper;

import com.jiyun.myblog.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

// 마이바티스에서 SQL 구문을 등록할 매퍼 인터페이스(또는 XML로도 구현 가능)
// @Mapper 애너테이션 설정된 인터페이스 작성하면 마이바티스에서 구현 클래스 제공
@Mapper
public interface UserMapper {

	@Insert("INSERT INTO USERS(ID, USERNAME, PASSWORD, EMAIL) " +
			"VALUES((SELECT NVL(MAX(ID), 0) + 1 FROM USERS), #{username}, #{password}, #{email})")
	public void insertUser(User user);

	@Update("UPDATE USERS PASSWORD = #{password}, EMAIL = #{email} WHERE ID = #{id}")
	public void updateUser(User user);

	@Delete("DELETE USERS WHERE ID = #{id}")
	public void deleteUser(User user);

	@Select("SELECT * FROM USERS WHERE USERNAME = #{username}")
	public void getUser(User user);

	@Select("SELECT * FROM USERS ORDER BY USERNAME DESC")
	public List<User> getUserList();

}