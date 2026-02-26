package org.example.lesson8.homework8;

//4. Разворот введенной строки, без использования StringBuilder-а (преобразовать в массив символов потом перезаписать 0 и последний и так по порядку, и вернуть new String(массив символов));
public class ReverseString {
    public static void main(String[] args) {
        final String text = "Hello World";

        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        String result = new String(reversed);
        System.out.println("Развернутая строка: " + result);
    }
}
