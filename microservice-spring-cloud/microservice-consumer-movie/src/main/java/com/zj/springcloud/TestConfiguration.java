package com.zj.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.zj.springcloud.annotation.ExcludeFromComponentScan;

/**
 * @des 自定义ribbon的配置
 * 注意：这个类应该放置在springboot入口类外面的包，当spring扫描到此类，会启用本类的配置
 * 因为ribbon可以指定对某个微服务(serviceid来区别，比如microservice-provider-user和microservice-provider-user2)
 * 使用该配置，而其他微服务可以保持默认配置。
 * @author zj
 *
 */
@Configuration
@ExcludeFromComponentScan
public class TestConfiguration {
	/**
	 * @des配置负载均衡策略,默认是轮询
	 * @return
	 */
	@Bean
	public IRule ribbonRule(){
		return new RandomRule();
	}
	
}
