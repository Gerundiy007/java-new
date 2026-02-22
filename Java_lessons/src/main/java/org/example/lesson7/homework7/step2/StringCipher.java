//0. Класс StringCipher, метод  String decode(String str, int offset)
//1. Вводную строку str разбить на символы .toCharArray();
//2. char можно сравнить с int число в таблице ASCII;
//3. Каждый символ массива char увеличить на число offset (chars[i] += offset);
//4. Создать новую строку на основе измененного массива chars, = new String(chars);
//5. Вернуть зашифрованную новую строку;

package org.example.lesson7.homework7.step2;

public class StringCipher {
    public String decode(String str, int offset) {

        if (str == null || str.isEmpty()) {
            System.out.println("Ошибка: строка null или пустая");
            return "";
        }

        // 1. Разбиваем строку на массив символов
        final char[] chars = str.toCharArray();

        // 2. Увеличиваем каждый символ на offset
        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;
        }

        // 3. Создаём новую строку
        final String result = new String(chars);

        // 4. Возвращаем результат
        return result;
    }

}
