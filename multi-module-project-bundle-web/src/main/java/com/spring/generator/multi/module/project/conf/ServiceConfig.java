package com.spring.generator.multi.module.project.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@ComponentScan({ "com.spring.generator.multi.module.project.core.service"})
@EnableAspectJAutoProxy
@Import({DomainConfig.class})
public class ServiceConfig extends SpringBootServletInitializer implements WebApplicationInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConfig.class, args);
	}
}