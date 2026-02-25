package org.example.lesson8.homework8;

//1. Дано число 1234456771. Найти количество цифр и сумму цифр.

public class Counter {
    public static void main(String[] args) {
        final String number = "1234456771";
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }

        System.out.println("Кол-во цифр = " + number.length());
        System.out.println("Сумма цифр = " + sum);
    }

}
