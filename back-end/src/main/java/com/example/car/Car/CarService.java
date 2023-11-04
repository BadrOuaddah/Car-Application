package com.example.car.Car;

public class CarService {
    private CarDao carDao;
    private EmailService emailService;
    private MOTService motService;

    public CarService(CarDao carDao){
        this.carDao = carDao;
//        EmailService emailService, MOTService motService
//        this.emailService = new EmailService();
//        this.motService = new MOTService();
    }

    public void addCar(Car car){

    }
    public void updateCar(Car car){

    }
    public void deleteCar(Car car){

    }
}
