package org.example.lesson11.homework11.step2;

import java.util.Arrays;
import java.util.List;

import static org.example.lesson11.homework11.step2.AllItemsAreUnique.allItemsAreUnique;

public class AllItemsAreUniqueExecute {
    public static void main(String[] args) {

        final List<String> list = Arrays.asList(
                "яблоко",
                "банан",
                "апельсин",
                "груша",
                "киви",
                "банан",
                "персик",
                "дыня",
                "манго",
                "яблоко"
        );

        System.out.println("Список элементов:");
        System.out.println(list);

        System.out.println("----------------------------");

        boolean result = allItemsAreUnique(list);

        if (result) {
            System.out.println("Все элементы в списке уникальны ✅");
        } else {
            System.out.println("В списке есть дубликаты ❌");
        }
    }
}
