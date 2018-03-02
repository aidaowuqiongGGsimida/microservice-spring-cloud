package com.zj.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zj.springcloud.entity.User;

@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignClient {
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User user(@PathVariable("id") Long id);

}
