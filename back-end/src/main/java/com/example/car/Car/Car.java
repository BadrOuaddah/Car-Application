package com.example.car.Car;

public class Car {
    private int id;
    private String name;
    private String logo;
    private String model;
    private float price;

    public Car() {
    }

    public Car(int id, String name, String logo, String model, float price) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
