package br.com.uniteste.msvteste1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class MsvTeste1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsvTeste1Application.class, args);
	}

}
