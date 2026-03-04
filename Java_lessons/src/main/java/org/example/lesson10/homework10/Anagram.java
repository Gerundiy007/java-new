package org.example.lesson10.homework10;

import java.util.Arrays;
//д/з 1. Введено два слова проверить являются они анаграммами (проверите на пустоту строк, на длину строк, проверки на одинаковость отсортированных списков букв): например  Аня – Яна;
//2. Развернуть `List<Integer>` “на месте” без создания второго списка, используйте доп. метод
//void swap(Integer a, Integer b) {
//    Integer temp = a;
//    a = b;
//    b = temp;
//}
//3. Удалить из `List<Integer>` все чётные числа (важно сделать корректно, без пропуска элементов).
//        4. Дан `List<Integer>`. Найти сумму, среднее, максимум, минимум;
//5. Дан `List<Integer>`. Заменить все отрицательные элементы на `0`;


public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("Аня", "Яна"));
    }

    public static boolean isAnagram(String name1, String name2) {


        if (name1 == null || name2 == null) {
            return false;
        }

        if (name1.length() != name2.length()) {
            return false;
        }

        name1 = name1.toLowerCase();
        name2 = name2.toLowerCase();

        char[] arr1 = name1.toCharArray();
        char[] arr2 = name2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
