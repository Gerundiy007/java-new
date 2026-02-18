package org.example.lesson6.homework6.step1;

import java.time.LocalDate;

public class Weather {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        TimeOfYear season = TimeOfYear.from(date);

        System.out.println("Сегодня: " + date);
        System.out.println("Сейчас время года: " + season);
    }
}

