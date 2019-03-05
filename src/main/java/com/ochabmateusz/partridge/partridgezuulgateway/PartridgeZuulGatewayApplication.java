package com.ochabmateusz.partridge.partridgezuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableZuulProxy
public class PartridgeZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartridgeZuulGatewayApplication.class, args);
	}




	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
