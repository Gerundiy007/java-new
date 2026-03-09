package org.example.lesson11.homework11.step2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllItemsAreUnique {

    public static boolean allItemsAreUnique(List<String> list) {

        final Set<String> set = new HashSet<>();

        for (String item : list) {
            if (!set.add(item)) {
                return false;
            }
        }

        return true;
    }

}