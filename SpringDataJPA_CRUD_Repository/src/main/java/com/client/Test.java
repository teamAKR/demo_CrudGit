package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com")
@EntityScan("com")
@EnableJpaRepositories("com")
public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Main...starts");
		SpringApplication.run(Test.class, args);
		
		System.out.println("Main...ends");
	}

}
