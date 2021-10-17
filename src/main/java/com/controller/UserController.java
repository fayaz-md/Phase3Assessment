package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;
import com.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping(value="createUser",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	@PutMapping(value="user",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateUser( @RequestBody User user) {
		userService.updateUser(user);
		
	}
	@GetMapping(value="/user/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable (value="id") int id) {
		return userService.getUserById(id);
	}
	public User getUserByUserName(String userName) {
		User user=null;
		for(User i :userService.userList()){
			if(i.getUserName().equals(userName)){
				user=i;
			}
		}
			return user;
	}

	@DeleteMapping("/user/{userId}")
	public void deleteUserById(@PathVariable int userId) {
		userService.deleteUserById(userId);
	}
	
	//password change for an admin
	@PutMapping("/passwordChange")
	public void updateUserPassword(@RequestBody User user) {
		//Later: check in session who is the user
		if(getUserByUserName(user.getUserName())!=null){
			User currentUser =getUserByUserName(user.getUserName());
			if(currentUser.getAdmin()==1) {
				userService.updateUser(currentUser);
			}
		}
	}
	
	@PostMapping("/login")
	public String isExistingUser(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		String loginMessage="";
		List<User> userList=userService.userList();
		for(User user :userList) {
			if(userName.equals(user.getUserName())) {
				if(user.getPassword().equals(password)){
					loginMessage="Login Successfuly!";
					
					break;
				}
			}
			loginMessage="Username doesnt exist";
			break;
		}
		return loginMessage;
	}
}
