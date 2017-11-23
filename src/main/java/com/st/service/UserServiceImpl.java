package com.st.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.st.dao.UserDao;
import com.st.model.User;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(User user) {
		userDao.save(user);
	}

	public List<User> queryAllUser() {
		return userDao.findAll();
	}

	public void deleteUserById(int id) {
		userDao.deleteUserById(id);
	}

}
