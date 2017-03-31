package com.sawyer.springboot.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 
 * @author <a href="mailto:sawyer@wolaidai.com">sawyer</a>
 */
public class UserRequest
{
	@NotNull(message = "请输入手机号")
	@Pattern(regexp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$", message = "请输入正确的手机号")
	@ApiModelProperty(name="mobile",value="手机号码")
	private String mobile;
	
	@NotNull(message = "请输入名字")
	@ApiModelProperty(name="name",value="用户名字")
	private String name;

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
	
}
