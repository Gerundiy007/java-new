package org.example.lesson6.homework6.step2;


public class MainCurrency {
    public static void main(String[] args) {
        CurrencyList currencyRub = CurrencyList.RUB;
        System.out.println(String.format("%s \nКод валюты - %d \nКурс валюты - %f",
                currencyRub.getRusFields(),
                currencyRub.getCurrencyCode(),
                currencyRub.getRate()));
        System.out.println("-------------------------");

        CurrencyList currencyEur = CurrencyList.EUR;
        System.out.println(String.format("%s \nКод валюты - %d \nКурс валюты - %f",
                currencyEur.getRusFields(),
                currencyEur.getCurrencyCode(),
                currencyEur.getRate()));
        System.out.println("-------------------------");

        CurrencyList currencyKzt = CurrencyList.KZT;
        System.out.println(String.format("%s \nКод валюты - %d \nКурс валюты - %f",
                currencyKzt.getRusFields(),
                currencyKzt.getCurrencyCode(),
                currencyKzt.getRate()));
        System.out.println("-------------------------");

    }
}
