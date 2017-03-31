package com.sawyer.springboot.api;

import com.sawyer.springboot.model.User;

public interface UserService {

	public User getUser(String mobile);
	
	public void saveUser(User user);
}
