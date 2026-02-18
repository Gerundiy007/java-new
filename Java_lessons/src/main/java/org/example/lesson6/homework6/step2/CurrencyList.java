//реализовать enum курсы валют с полями наименование на русском, код валюты, коэффициент относительно доллара

package org.example.lesson6.homework6.step2;

public enum CurrencyList {
    RUB("Рубль", 184, 0.01305141),
    EUR("Евро", 206, 1.18),
    KZT("Тенге", 301, 0.002038);

    private final String rusFields;
    private final int currencyCode;
    private final double rate;

    CurrencyList(String rusFields, int currencyCode, double rate) {
        this.rusFields = rusFields;
        this.currencyCode = currencyCode;
        this.rate = rate;
    }

    public String getRusFields() {
        return rusFields;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public double getRate() {
        return rate;
    }

}
