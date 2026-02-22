//1. Реализовать класс PhoneNumberValidator с методом boolean validate(String phone) русские операторы:
//        1. Если phone == null или пустая строка вернуть false;
//        2. Проверить
//- что первый символ '+' или 8;
//        --- "+7 999 - 555_11 22" - true
//        --- "9 999 - 555_11 22" - false
//        - без учета +7 или 8 остальные цифры в количестве 10 шт;
//--- "+7 999 - 555_11 2" - false
//        --- "+7 999 - 555_11 1122" - false
//Дополнительные условия:
//        - Строка может содержать любые символы в ограниченном количестве до 20 шт. (a-z, 0 - 9, пробелы, -, _)

package org.example.lesson7.homework7.step1;

public class ValidPhoneNumber {
    public static boolean valid(String phone) {
        // 1. Проверка на null или пустую строку
        if (phone == null || phone.isEmpty()) {
            System.out.println("Ошибка: номер пустой не может быть пустым");
            return false;
        }

        // 2. Ограничение по длине символов
        if (phone.length() > 20) {
            System.out.println("Ошибка: длина номера не может привышать более 20 символов");
            return false;
        }

        // 3. Проверка первого символа
        if (!(phone.startsWith("+") || phone.startsWith("8"))) {
            System.out.println("Ошибка: номер должен начинаться с '+' или '8'");
            return false;
        }

        // Удаляем всё кроме цифр
        final String digitsOnly = phone.replaceAll("\\D", "");
        System.out.println("Преобразованный номер (только цифры): " + digitsOnly);

        // 4. Проверка +7
        if (phone.startsWith("+")) {
            if (!digitsOnly.startsWith("7")) {
                System.out.println("Ошибка: после '+' должна быть цифра 7");
                return false;
            }

            if (digitsOnly.length() != 11) {
                System.out.println("Ошибка: после +7 должно быть ровно 10 цифр");
                return false;
            }
        }

        // 5. Проверка 8
        if (phone.startsWith("8")) {

            if (digitsOnly.length() != 11) {
                System.out.println("Ошибка: после 8 должно быть ровно 10 цифр");
                return false;
            }
        }

        // 6. Код оператора не может начинаться с 0
        if (digitsOnly.charAt(1) == '0') {
            System.out.println("Ошибка: код оператора не может начинаться с 0");
            return false;
        }

        return true;
    }
}
