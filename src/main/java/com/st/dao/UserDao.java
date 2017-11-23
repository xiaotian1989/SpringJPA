package com.st.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.st.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	@Modifying
	@Query(value="delete from jpa_user where id=?1", nativeQuery=true)
	public void deleteUserById(int id);

}
