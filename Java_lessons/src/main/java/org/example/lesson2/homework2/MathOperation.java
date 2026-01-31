package org.example.lesson2.homework2;

import java.util.Random;
import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {

//Решение задачи 1
        int number = 129;
        boolean res = number >= 100 && number <= 1000;
        System.out.println("1.Число в диапазане от 100 до 1000  \nВаше число - " + number + "\nОтвет - " + res);

// Решение задачи 1.1.2
        int number2 = -12;
        boolean res2 = number2 <= 1 || number2 >= 1000;
        System.out.println("2.Число за пределами диапазона [1, 1000]  \nВаше число : " + number2 + "\nОтвет - " + res2);

// Решение задачи 1.1.3
        int number3 = 301;
        boolean res3 = (number3 <= 1 && number3 <= 10) || (number3 <= 100 && number3 >= 300);
        System.out.println("3.Число только в диапазонах [1, 10] или [100, 300] \nВаше число : " + number3 + "\nОтвет - " + res3);


// Решение задачи 1.1.5
        int number5 = 14;
        boolean res5 = (number5 % 5 == 0) || (number5 % 7 == 0);
        System.out.println("4.Число кратное 5 и 7 \nВаше число : " + number5 + "\nОтвет - " + res5);

// Решение задачи 1.1.6
        int number6 = 9;
        boolean res6 = (number6 % 3 == 0 && number6 % 9 != 0);
        System.out.println("5.Число кратное 3 но не кратное 9 \nВаше число : " + number6 + "\nОтвет - " + res6);

// Решение задачи 2
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        if (randomNumber <= 30) {
            System.out.println("6.Молодой челик: " + randomNumber + " годиков");
        } else {
            System.out.println("6.Старый челик: " + randomNumber + " годиков");
        }
// Решение задачи 1.1.4
        // Создаем объект Scanner для ввода
        Scanner scanner = new Scanner(System.in);
        // Вывод текста ввода
        System.out.print("7.Введите число: ");
        // Читаем число, введенное пользователем
        int number4 = scanner.nextInt();

        if (number4 % 2 == 0) {
            System.out.println("Число четное " + " - " + number4);
        } else {
            System.out.println("Число нечетное " + " - " + number4);
        }
    }
}
