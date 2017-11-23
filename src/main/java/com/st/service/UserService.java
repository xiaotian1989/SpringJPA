package com.st.service;

import java.util.List;

import com.st.model.User;

public interface UserService {

	public void addUser(User user);
	
	List<User> queryAllUser();
	
	void deleteUserById(int id);
}
