package com.carloscardona.icroservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Main Spring Boot Application class.<br>
 * <br>
 * 
 * The {@link EnableConfigServer} annotation defines that this application will serve as the REST based API for providing external
 * configuration. <br>
 * <br>
 * 
 * The external repository from where the configuration will be picked up is defined in the {@linkplain application.yml} file.
 *
 * @author candr
 */
@EnableAutoConfiguration
@EnableConfigServer
@ComponentScan
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}