package org.example.lesson2.homework2;

import java.util.Random;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Car exm1 = new Car();
        exm1.brand = "Nissan";
        exm1.color = "Red";
        exm1.price = 2000;
        exm1.year = 2020;
        exm1.speed = 150;

        Car exm2 = new Car();
        exm2.brand = "Lada";
        exm2.color = "Black";
        exm2.price = 500;
        exm2.year = 2000;
        exm2.speed = 100;

        Car exm3 = new Car("Lamborgini", "Yellow", 500000, 2025, 250);
        Car exm4 = new Car("Bugatti", "Pink", 100000, 2024, 250);
        Car exm5 = new Car("Hyundai", "Blue", 100000, 2019, 150);
        Car exm6 = new Car("Merc Benz", "Green", 100000, 2018, 120);


        // Вывод информации о машине 3
        System.out.println("Машина 3:");
        System.out.println("Бренд: " + exm3.brand);
        System.out.println("Цвет: " + exm3.color);
        System.out.println("Цена: " + exm3.price);
        System.out.println("Год: " + exm3.year);
        System.out.println("Скорость: " + exm3.speed);


    }
}


