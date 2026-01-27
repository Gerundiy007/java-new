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
        char emoji = 'a';


        System.out.println(intRes);
    }
}
