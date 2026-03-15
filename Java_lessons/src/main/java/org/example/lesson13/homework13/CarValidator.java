package org.example.lesson13.homework13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarValidator {
    public static void main(String[] args) {

        final List<Car> cars = Arrays.asList(
                new Car("BMW", 20000, "Black", 2018, 2),
                new Car("Audi", 25000, "White", 2021, 1),
                new Car("Toyota", 15000, "Gray", 2019, 3),
                new Car("Honda", 17000, "Blue", 2022, 1),
                new Car("Mercedes", 30000, "Black", 2017, 2),
                new Car("Kia", 12000, "Red", 2016, 2),
                new Car("Ford", 4000, "White", 2020, 1),
                new Car("Mazda", 16000, "Blue", 2019, 4),
                new Car("Hyundai", 1000, "Gray", 2018, 2),
                new Car("Tesla", 45000, "Black", 2023, 1)
        );

        System.out.println("Исходный список:");
        cars.forEach(System.out::println);


        final var carsBefore2020 = cars.stream()
                .filter(car -> car.getYear() < 2020)
                .toList();

        System.out.println("\nМашины младше 2020 года:");
        carsBefore2020.forEach(System.out::println);


        final var updatedCarsColor = carsBefore2020.stream()
                .map(car -> {
                    if (car.getPrice() < 5000) {
                        return new Car(car.getBrand(), car.getPrice(), "Green", car.getYear(), car.getOwners());
                    }
                    return car;
                })
                .toList();

        System.out.println("\nПосле изменения цвета:");
        updatedCarsColor.forEach(System.out::println);


        final var updatedCarsPrice = updatedCarsColor.stream()
                .map(car -> new Car(
                        car.getBrand(),
                        car.getPrice() * 90,
                        car.getColor(),
                        car.getYear(),
                        car.getOwners()
                ))
                .map(car -> car.getYear() < 2020
                        ? new Car(car.getBrand(), car.getPrice() + 10000, car.getColor(), car.getYear(), car.getOwners())
                        : car)
                .toList();

        System.out.println("\nПосле изменения цен:");
        updatedCarsPrice.forEach(System.out::println);


        final var car = updatedCarsPrice.stream()
                .filter(c -> c.getPrice() < 150000)
                .findFirst()
                .orElseThrow(() -> new CarNotFoundException("Авто с ценой < 150000 не обнаружено"));

        System.out.println("\nНайден автомобиль:");
        System.out.println(car);

        final var anyMatch = updatedCarsPrice.stream()
                .anyMatch(c ->
                        c.getPrice() > 2_000_000 &&
                                c.getOwners() == 1 &&
                                c.getYear() > 2016
                );
        System.out.println("\n----------------------------------------------------");

        System.out.println("Есть ли хотя бы одно авто подходящее под условие: " + anyMatch);

        final var allMatch = updatedCarsPrice.stream()
                .allMatch(c ->
                        c.getPrice() > 2_000_000 &&
                                c.getOwners() == 1 &&
                                c.getYear() > 2016
                );

        System.out.println("Все ли авто соответствуют условию: " + allMatch);


        final var noneMatch = updatedCarsPrice.stream()
                .noneMatch(c ->
                        c.getPrice() > 2_000_000 &&
                                c.getOwners() == 1 &&
                                c.getYear() > 2016
                );

        System.out.println("Нет ли авто подходящих под условие: " + noneMatch);
    }
}

