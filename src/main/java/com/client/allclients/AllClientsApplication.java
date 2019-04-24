package com.client.allclients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AllClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllClientsApplication.class, args);
	}

}
