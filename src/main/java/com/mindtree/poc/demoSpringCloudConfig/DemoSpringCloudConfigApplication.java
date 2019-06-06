package com.mindtree.poc.demoSpringCloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudConfigApplication.class, args);
	}

}
