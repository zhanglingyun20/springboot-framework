package com.sawyer.springboot.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sawyer.springboot.dto.ResponseVo;
import com.sawyer.springboot.exception.BussinessException;

@RestController
public class HelloController
{

	@RequestMapping("/index")
	public String index()
	{
		return "Greetings from Spring Boot!";
	}

	@RequestMapping(value ="/sayhello",method=RequestMethod.GET)
	public ResponseVo<?> sayhello(String name)
	{

		if ("error".equals(name))
		{
			throw new BussinessException("errors.name.error");
		}
		if (StringUtils.isEmpty(name)) {
			name.subSequence(0, 1);
		}
		return new ResponseVo<>("OK");
	}

}