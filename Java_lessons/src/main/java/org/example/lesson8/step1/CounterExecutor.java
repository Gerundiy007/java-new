package org.example.lesson8.step1;

public class CounterExecutor {
    public static void main(String[] args) {
        final String[] strArray = {"hello", "world", "Java", "Python", "Go"};
        System.out.println("Количество символов в строке = " + countWords(strArray));
        countSymbols(strArray, 'o');
        // количество букв 'o' в массиве строк
        System.out.println("Количество букв 'o' = " + countSymbols(strArray, 'o'));
    }

    /**
     * Метод считает общее количество всех символов во всех строках массива.
     */
    private static int countWords(String[] str) {
        // количество символов в строках
        int count = 0;
        for (String s : str) {
            count += s.length();
        }
        return count;
    }

    /**
     * Метод считает сколько раз указанный символ встречается в массиве строк.
     */
    private static int countSymbols(String[] str, char chr) {
        int count = 0;
        for (String s : str) {
            for (char c : s.toCharArray()) {
                if (c == chr) {
                    count++;
                }
            }
        }
        return count;
    }
}
