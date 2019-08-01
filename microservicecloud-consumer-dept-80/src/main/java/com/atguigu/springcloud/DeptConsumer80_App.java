package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)//自定义ribbon负载均衡算法
public class DeptConsumer80_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
