package com.simplemall.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Starter
 * 
 * @author Li Feng
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class AccountServApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServApplication.class, args);
	}

}
