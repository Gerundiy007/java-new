package org.example.lesson5.homework5.operation3;

public abstract class AbstractPrinter implements Print {
    private final String printerType;
    private final String printerModel;

    public AbstractPrinter(String printerModel, String printerType) {
        this.printerModel = printerModel;
        this.printerType = printerType;
    }
    @Override
    public void print() {
        System.out.println("Начало печати");
    }

    @Override
    public void getPrinterModel() {
        System.out.println("Модель: " + printerModel);
    }

    @Override
    public void getPrinterType() {
        System.out.println("Тип: " + printerType);
    }

    }
