package org.example.lesson1;

public class Main {
    public static void main(String[] args) {
        // Числа
        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 3;
        long longVar = 4;

        // float
        float floatVar = 123.45f;
        double doubleVar = 123.456d;

        var number = 1234;
        // + - * / %

        var result = byteVar + shortVar;
        var result1 = longVar/ byteVar;

        // дает 0 (при целых числах)

        var result2 = 1000/1000000;


        // указание дробного числа
        var res = 10/3.0;
        


        //округление

        int intRes = (int) res;

        var res1 = floatVar + byteVar;

        // boolean
        boolean b = true;

        // && (и) - || или - ! (НЕТ)
        //char
        // emoji = "\\uD83D\\uDE00";

        double a = 10.343 + 22.213;
        double v = 12.546 - 6.32132;
        double n = 4125 * 532;
        double n2 = n * n;
        double n3 = n2 / n;
        double n4 = n3 % n2;


        System.out.println(a);
        System.out.println(v);
        System.out.println(n);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(res);
        System.out.println(emoji);
    }
}
