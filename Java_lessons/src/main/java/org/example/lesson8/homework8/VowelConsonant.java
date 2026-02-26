package org.example.lesson8.homework8;

//3. Дана любая строка, посчитать количество гласных и согласных букв;
public class VowelConsonant {
    public static void main(String[] args) {
        final String text = "ASFgadhgd!fkigfnm s@m%d^g&k*d1r2o3iutpmkwl";
        int vowelsCount = 0;
        int consonantsCount = 0;
        int specialCount = 0;


        final String vowels = "aeiouAEIOU";

        for (char c : text.toCharArray()) {

            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else {
                specialCount++;
            }
        }

        System.out.println("Гласные: " + vowelsCount);
        System.out.println("Согласные: " + consonantsCount);
        System.out.println("Спецсимволы и другие: " + specialCount);
    }
}
