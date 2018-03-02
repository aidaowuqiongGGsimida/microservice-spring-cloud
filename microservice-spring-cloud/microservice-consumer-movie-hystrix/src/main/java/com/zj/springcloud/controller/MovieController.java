package com.zj.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zj.springcloud.entity.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	@HystrixCommand(fallbackMethod = "findByIdFallback")
	public User movie(@PathVariable Long id){
		return restTemplate.getForObject("http://microservice-provider-user/user/"+id, User.class);
	}
	
	//回调接口
	public User findByIdFallback(Long id) {
	    User user = new User();
	    user.setId(0L);
	    user.setName("小兵");
	    return user;
	  }
}
