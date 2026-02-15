package org.example.lesson3.homework3;

public class CarImpl implements Car {

    private String model;
    private String color;
    private double price;


    public CarImpl(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("Модель: " + getModel());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
    }
}