package com.sawyer.springboot.dto;

import javax.validation.constraints.NotNull;

import org.aspectj.lang.annotation.Aspect;
import org.hibernate.validator.constraints.Length;


public class Address {

	@NotNull(message = "请输入地址")
	@Length(min=2,message="长度不能小于2")
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
