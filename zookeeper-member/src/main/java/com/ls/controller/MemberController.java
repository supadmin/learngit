package com.ls.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class MemberController {

	@Value("${server.port}")
	private String serverport;
	
	@RequestMapping("/getMember")
	public String getMember() {
		return "this is getMember,端口号："+serverport;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MemberController.class, args);
	}
	
	//@EnableDiscoveryClient作用是：如果服务使用consul\zookeeper，使用@EnableDiscoveryClient向注册中心注册服务
}
