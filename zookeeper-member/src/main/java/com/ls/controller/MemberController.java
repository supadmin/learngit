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
		return "this is getMember,�˿ںţ�"+serverport;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MemberController.class, args);
	}
	
	//@EnableDiscoveryClient�����ǣ��������ʹ��consul\zookeeper��ʹ��@EnableDiscoveryClient��ע������ע�����
}
