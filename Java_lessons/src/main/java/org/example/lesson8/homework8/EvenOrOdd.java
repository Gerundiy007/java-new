package org.example.lesson8.homework8;

public class EvenOrOdd {
    public static void main(String[] args) {
        final int[] numbers = {1, 5, 8, 11, 0, -5, 13, 81, 100};

        int sumEven = 0;
        int countEven = 0;
        int sumOdd = 0;
        int countOdd = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sumEven += num;
                countEven++;
            } else {
                sumOdd += num;
                countOdd++;
            }
        }

        System.out.println("Чётные числа: \nколичество = " + countEven + ",\nсумма = " + sumEven);
        System.out.println("Нечётные числа: \nколичество = " + countOdd + ",\nсумма = " + sumOdd);
    }
}
