package com.example.car.Car;

public class CarService {
    private CarDao carDao;
    private EmailService emailService;
    private MOTService motService;

    public CarService(CarDao carDao, EmailService emailService, MOTService motService){
        this.carDao = new CarDao();
        this.emailService = new EmailService();
        this.motService = new MOTService();
    }
}
