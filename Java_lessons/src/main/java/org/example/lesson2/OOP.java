package org.example.lesson2;

public class OOP {
    //private, protected, static
    public static void main(String[] args) {

        Emoloyee emp1 = new Emoloyee();
        emp1.name = "Вася";
        emp1.age = 25;
        emp1.salary = 5000;

        Emoloyee emp2 = new Emoloyee();
        emp2.name = "Игорь";
        emp2.age = 22;
        emp2.salary = 4000;

        Emoloyee emp3 = new Emoloyee("Денис",34,10000);// Конструктор
    }
}
