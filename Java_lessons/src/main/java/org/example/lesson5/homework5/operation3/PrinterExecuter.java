package org.example.lesson5.homework5.operation3;

public class PrinterExecuter {
    public static void main(String[] args) {
        Print epson = new Printer1("Epson L1800", "Цветная печать");
        epson.getPrinterModel();
        epson.getPrinterType();
        epson.print();
        epson.clear();
        Print pantum = new Printer2("Kyocera ECOSYS", "Цвет Ч/Б");
        pantum.getPrinterModel();
        pantum.getPrinterType();
        pantum.print();
        pantum.clear();
        Print kyocera = new Printer3("Pantum P2502", "Цвет Ч/Б");
        kyocera.getPrinterModel();
        kyocera.getPrinterType();
        kyocera.print();
        kyocera.clear();

    }

}