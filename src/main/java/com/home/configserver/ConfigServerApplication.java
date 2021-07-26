package com.home.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args)
	{
		System.setProperty("spring.config.name", "config-server");
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
