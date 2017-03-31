package com.sawyer.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sawyer.springboot.api.UserService;
import com.sawyer.springboot.model.User;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{

	@Override
	public User getUser(String mobile) {
		return new User("sawyer", mobile);
	}

	@Override
	public void saveUser(User user) {
	}
}
