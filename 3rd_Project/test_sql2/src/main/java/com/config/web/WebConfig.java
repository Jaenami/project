package com.config.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


	@Configuration
	public class WebConfig implements WebMvcConfigurer {

	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	                .allowedOrigins("https://localhost:8443") // 허용할 출처
	                .allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS")
	                .allowedHeaders("*")
	                .allowCredentials(true);
	    }
	}
