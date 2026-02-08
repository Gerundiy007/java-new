package org.example.lesson3.homework3;

import java.util.UUID;

public class Executer {

    public static void main(String[] args) {
        final ProductCredit productCredit = new ProductCredit();
        productCredit.setId(UUID.randomUUID());
        productCredit.setIsActive(1);
        productCredit.setPurpose("Договор");
        productCredit.setArchived(false);

        System.out.println(productCredit.getIsActive() + "- Хер во всей морде");
        System.out.println(productCredit.getId());
        System.out.println(productCredit.getPurpose());
    }
}
