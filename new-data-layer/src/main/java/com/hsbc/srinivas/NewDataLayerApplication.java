package com.hsbc.srinivas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hsbc.srinivas.service.ProfileServiceImpl;

@SpringBootApplication
public class NewDataLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewDataLayerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ProfileServiceImpl profileService) {
		return args -> {
			profileService.addProfiles();

		};
	}

}
