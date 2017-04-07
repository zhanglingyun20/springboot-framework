package com.sawyer.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.sawyer.springboot.api.UserService;
import com.sawyer.springboot.mapper.UserMapper;
import com.sawyer.springboot.model.User;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(String mobile) {
		return new User("sawyer", mobile);
	}

	@Override
	public int saveUser(User user) {
		userMapper.saveUser(user);
		return user.getId();
	}

	@Override
	public User getUserByMobile(String mobile) {
		return userMapper.getUserByMobile(mobile);
	}
}
