package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	
	public User createUser(User user) {
		return userDao.save(user);
	}

	public User updateUser(User user) {
		return userDao.save(user);
	}

	public User getUserById(int id) {
		return userDao.findById(id).get();
	}

	public void deleteUserById(int id) {
		userDao.deleteById(id);
	}
	public List<User> userList() {
		return userDao.findAll();
	
	}
}
