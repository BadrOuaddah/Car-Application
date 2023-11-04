package com.example.car;

import com.example.car.Car.CarDao;
import com.example.car.Car.CarService;
import com.example.car.Car.EmailService;
import com.example.car.Car.MOTService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarApplication {

	public static void main(String[] args) {

		EmailService emailService = new EmailService();
		MOTService motService = new MOTService();

		CarService carService = new CarService();

		SpringApplication.run(CarApplication.class, args);
	}

}
