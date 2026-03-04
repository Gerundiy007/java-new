package org.example.lesson10.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTasks {

    public static void main(String[] args) {

       final List<Integer> list = new ArrayList<>(Arrays.asList(1, -51, 88, 11, 0, -321, 13, 4, 100));

        System.out.println("Список: " + list);

        reverse(list);
        System.out.println("Развернутый список: " + list);

        replaceNegative(list);
        System.out.println("Список после замены отрицательных: " + list);

        calculate(list);

        removeEven(list);
        System.out.println("Список после удаления четных: " + list);
    }

    /**
     * Метод разворачивает список
     */
    public static void reverse(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            swap(list, left, right);
            left++;
            right--;
        }
    }

    /**
     * Метод меняет местами два элемента списка по индексам
     */
    private static void swap(List<Integer> list, int a, int b) {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    /**
     * Метод удаляет все четные числа из списка
     */
    public static void removeEven(List<Integer> list) {
       final Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    /**
     * Метод считает сумму, среднее, максимум и минимум элементов списка
     */
    public static void calculate(List<Integer> list) {

        if (list.isEmpty()) {
            System.out.println("Список пустой");
            return;
        }

        int sum = 0;
        int max = list.get(0);
        int min = list.get(0);

        for (Integer num : list) {
            sum += num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        double avg = (double) sum / list.size();


        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + avg);
    }

    /**
     * Метод заменяет все отрицательные элементы списка на 0
     */
    public static void replaceNegative(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }
    }
}