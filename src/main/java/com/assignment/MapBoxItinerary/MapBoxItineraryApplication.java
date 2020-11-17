package com.assignment.MapBoxItinerary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.assignment.Controller.MapBoxItineraryController;

@SpringBootApplication
@ComponentScan(basePackages = "com.assignment.*")
public class MapBoxItineraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapBoxItineraryApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
