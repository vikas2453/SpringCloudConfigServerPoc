package com.mindtree.poc.demoSpringCloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// This for enabling the config server
@EnableConfigServer
//This is for registering the config server with discovery server
@EnableDiscoveryClient
public class DemoSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudConfigApplication.class, args);
	}

}
