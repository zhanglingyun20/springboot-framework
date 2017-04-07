package com.sawyer.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.sawyer.springboot.model.User;
/**
 * 
 * @ClassName: UserMapper  
 * @Description:
 * @author zhanglingyun  
 * @date 2017年4月7日
 */
@Mapper
public interface UserMapper {

	User getUserByMobile(@Param("mobile") String mobile);
	
	int saveUser(User user);
}
