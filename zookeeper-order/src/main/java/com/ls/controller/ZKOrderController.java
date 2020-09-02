package com.ls.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class ZKOrderController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/getorder")
	public String getOrder() {
		// order ʹ��rpc Զ�̵��ü��� ���� ��Ա����
		String memberUrl = "http://app-ls-member/getMember";
		String result = restTemplate.getForObject(memberUrl, String.class);
		System.out.println("��Ա������ö�������,result:" + result);
		return result;
	}
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
