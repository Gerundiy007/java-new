package org.example.lesson8.step3;

/**
 * Основной метод, считаем сколько в строке букв, цифр и других символов.
 */
public class CharacterService {
    public static void main(String[] args) {
        final var str = "3dfl,  405DFJSm+ * - ";
        int countAlpha = 0;
        int countNumbers = 0;
        int countSpecialSymbols = 0;

        for (char chr : str.toCharArray()) {
            if (Character.isAlphabetic(chr)) {
                countAlpha++;
            } else if (Character.isDigit(chr)) {
                countNumbers++;
            } else {
                countSpecialSymbols++;
            }
        }
        System.out.println("Количество букв = " + countAlpha);
        System.out.println("Количество цифр = " + countNumbers);
        System.out.println("Количество других символов = " + countSpecialSymbols);
    }
}
