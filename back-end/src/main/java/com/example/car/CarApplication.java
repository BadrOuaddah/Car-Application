package com.example.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {

		CarDao carDao = new CarDao();
		EmailService emailService = new EmailService();
		MOTService motService = new MOTService();

		CarService carService = new CarService(carDao,emailService,motService);


		SpringApplication.run(CarApplication.class, args);
	}

}
