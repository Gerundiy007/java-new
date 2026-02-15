//Задание со звездочкой:
//        1. Создать интерфейс Printer c абстрактными методами
// - void print();
//- void clear();
//- void getPrinterModel();
//2. Создать абстрактный класс AbstractPrinter имплементировать методы Printer и добавить поля:
//        - printerModel;
//- printerType (цветной или чб);
//3. Создать 3 класса наследующие AbstractPrinter, например HPColorPrinter, CanonBlackPrinter;
//4. Создать класс PrinterExplorer и реализовать все 3 принтера и вызвать методы;

package org.example.lesson5.homework5.operation3;

public interface Print {

    void print();
    void getPrinterModel();
    void getPrinterType();
    default void clear() {
        System.out.println("Принтер очищается,пожалуйста,подождите");
    }

}
