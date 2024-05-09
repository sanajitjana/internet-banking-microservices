package com.sanajitjana.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayInternetBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayInternetBankingApplication.class, args);
	}

}
