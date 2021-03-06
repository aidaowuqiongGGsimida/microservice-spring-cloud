package com.zj.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zj.springcloud.entity.User;
import com.zj.springcloud.feign.UserFeignClient;

@RestController
public class MovieController {

	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/movie/{id}")
	public User movie(@PathVariable Long id){
		return userFeignClient.user(id);
	}
	
	@GetMapping("/movie2")
	public User movie2(){
		User user = new User();
		user.setId(100L);
		user.setAge(new Short(1+""));
		user.setName("张力");
		
		return userFeignClient.user2(user );
	}
	
}
