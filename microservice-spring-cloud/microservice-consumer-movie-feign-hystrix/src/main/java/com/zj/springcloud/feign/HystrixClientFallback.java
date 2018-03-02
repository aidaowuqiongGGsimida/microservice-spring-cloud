package com.zj.springcloud.feign;


import org.springframework.context.annotation.Configuration;

import com.zj.springcloud.entity.User;

//@Configuration
public class HystrixClientFallback implements UserFeignClient {

	@Override
	public User user(Long id) {
		User user = new User();
		user.setId(1L);
		user.setName("Hystrix");
		return user;
	}

}