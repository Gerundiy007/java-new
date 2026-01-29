package org.example.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //> < >= <= !=
        int a = 1;
        int b = 2;
        boolean c = a < b;
        //System.out.println(c);
        // И || | +
        boolean b1 = true; // 1
        boolean b2 = false;// 0
        //      1    1 + 0 = 1
        boolean b3 = b1 || b2; // = true
        //           1 * 0 = 0
        boolean b4 = b1 && b2;
        //        было true стало false
        boolean b5 = !b1;
        //           1    0 = 1
        boolean b6 = b1 ^ b2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число");
//        String number = sc.nextLine();
//        Integer number1 = Integer.valueOf(number);

//        System.out.println("Ответ = " + (number1 % 2 == 0 ? "парное" : "непарное"));
        System.out.println("Max = " + (a > b ? a : b));
        // ++ -- += -= *= /= %=
        //++a
        System.out.println("Число увеличивается на 1 = " + (++a));
        // a = a % 2
        System.out.println(a %= 2);

        long a1 = 123_1000_0000L;

        Integer d ;// = null
        int n; // = 0
        boolean b7; // = false
        char ch; // = ?
    }
}
