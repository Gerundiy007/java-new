//1. Создать объект date = LocalDate.now(), проверить пору года (весна, лето, зима, осень);
package org.example.lesson6.homework6.step1;

import java.time.LocalDate;

public enum TimeOfYear {

    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public static TimeOfYear from(LocalDate date) {

        int month = date.getMonthValue();

        if (month == 12 || month == 1 || month == 2) {
            return WINTER;

        } else if (month >= 3 && month <= 5) {
            return SPRING;

        } else if (month >= 6 && month <= 8) {
            return SUMMER;

        } else if (month >= 9 && month <= 11) {
            return AUTUMN;


        }
        return null;
    }
}

