package com.sawyer.springboot.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sawyer.springboot.dto.ResponseVo;
import com.sawyer.springboot.dto.UserRequest;
import com.sawyer.springboot.service.UserInfoService;

/**
 * 
 * @ClassName: UserController
 * @Description:
 * @author zhanglingyun
 * @date 2017年3月31日
 */
@RestController
@RequestMapping("/user")
@Api(value = "User", description = "test User swagger API")
@Validated
public class UserController {

	@Autowired
	public UserInfoService userInfoService;

	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ApiOperation(value="新增用户", notes="新增用户")
	public ResponseVo<?> saveUser(@RequestBody @Valid UserRequest userRequest) {
		userInfoService.saveUser(userRequest);
		return new ResponseVo<>();
	}
	
	@RequestMapping(value="/save",method=RequestMethod.PUT)
	@ApiOperation(value="修改用户", notes="修改用户")
	public ResponseVo<?> updateUser(@RequestBody @Valid UserRequest userRequest) {
		userInfoService.saveUser(userRequest);
		return new ResponseVo<>();
	}

	@RequestMapping(value="/get/{mobile}",method=RequestMethod.GET)
	@ApiOperation(value="根据用户号码查询用户", notes="根据用户号码查询用户")
	@ApiImplicitParam(name = "mobile", value = "用户手机", required = true, dataType = "String")
	public ResponseVo<?> getUser(
			@NotNull @PathVariable("mobile") String mobile) {
		return new ResponseVo<>(userInfoService.getUserByMobile(mobile));
	}
}
