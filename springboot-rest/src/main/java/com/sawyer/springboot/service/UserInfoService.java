package com.sawyer.springboot.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sawyer.springboot.api.UserService;
import com.sawyer.springboot.dto.UserRequest;
import com.sawyer.springboot.exception.BussinessException;
import com.sawyer.springboot.model.User;

/**
 * 
 * @ClassName: UserInfoService
 * @Description:
 * @author zhanglingyun
 * @date 2017年3月31日
 */
@Service
public class UserInfoService {

	@Reference(version = "1.0.0")
	public UserService userService;

	public User getUserByMobile(String mobile) {
		if (!"123456".equals(mobile)) {
			throw new BussinessException("errors.mobile.error");
		}
		return userService.getUser(mobile);
	}

	public void saveUser(UserRequest userRequest) {
		User user = new User();
		BeanUtils.copyProperties(userRequest, user);
		userService.saveUser(user);
	}
}
