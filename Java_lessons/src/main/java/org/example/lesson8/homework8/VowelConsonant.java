package org.example.lesson8.homework8;

public class VowelConsonant {
    public static void main(String[] args) {
        String text = "Hello World"; 
        int vowelsCount = 0;
        int consonantsCount = 0;      

        // определяем все гласные буквы
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);  // берём символ строки

            // проверяем, что символ — это буква
            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Гласные: " + vowelsCount);
        System.out.println("Согласные: " + consonantsCount);
    }
}
