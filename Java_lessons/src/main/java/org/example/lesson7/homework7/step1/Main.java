package org.example.lesson7.homework7.step1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final ValidPhoneNumber validphonenumber = new ValidPhoneNumber();

        System.out.print("Введите номер телефона: ");
        final String input = scanner.nextLine();

        final boolean result = validphonenumber.valid(input);

        if (result) {
            System.out.println("Номер валиден ✅");
        } else {
            System.out.println("Номер не валиден ❌");
        }

        scanner.close();
    }
}
