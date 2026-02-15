package org.example.lesson3.homework3;

public class Main {
    public static void main(String[] args) {

        CarImpl car1 = new CarImpl("Toyota Camry", "Черный", 25000);
        CarImpl car2 = new CarImpl("BMW", "Белый", 55000);
        CarImpl car3 = new CarImpl("Tesla", "Красный", 45000);

        car1.setPrice(26000);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}