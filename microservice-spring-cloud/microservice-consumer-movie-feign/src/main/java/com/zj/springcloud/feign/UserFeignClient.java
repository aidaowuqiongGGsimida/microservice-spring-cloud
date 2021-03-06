package com.zj.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zj.springcloud.entity.User;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public User user(@PathVariable("id") Long id);

	//坑：虽然这里加入了GET的方法注解，但是由于参数为对象，所以feign依然很使用post方式
	@RequestMapping(value="/user2",method=RequestMethod.GET)
	public User user2(User user);
}
