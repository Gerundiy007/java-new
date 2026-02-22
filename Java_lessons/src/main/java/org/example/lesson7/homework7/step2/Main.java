package org.example.lesson7.homework7.step2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Random random = new Random();
        final StringCipher cipher = new StringCipher();

        System.out.print("Введите строку для шифрования: ");
        String input = scanner.nextLine();

        // Генерируем случайное смещение от 1 до 10
        int offset = random.nextInt(10) + 1;

        System.out.println("Случайное смещение (offset): " + offset);

        final String res = cipher.decode(input, offset);

        System.out.println("Результат шифрования: " + res);

        scanner.close();
    }
}
