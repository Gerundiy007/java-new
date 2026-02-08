package org.example.homework5;

public class EmployeeExecotor {
    public static void main(String[] args) {
        Emoloyee emp1 = new SA();
        emp1.setTask("Системный анализ 8.07.2");
        System.out.println(emp1.getName() +" "+emp1.getSalary());
        emp1.doTask();
        System.out.println("--------------------------------------");

        Emoloyee emp2 = new BA();
        emp2.setTask("Бизнес анализ 2.1.1");
        System.out.println(emp2.getName() +" "+emp2.getSalary());
        emp2.doTask();
        System.out.println("--------------------------------------");

        Emoloyee emp3 = new BE();
        emp3.setTask("Разработка микросервиса");
        System.out.println(emp3.getName() +" "+emp3.getSalary());
        emp3.doTask();
        System.out.println("--------------------------------------");

        Emoloyee emp4 = new QA();
        emp4.setTask("ВЗЯТЬ ВСЕ ЗАДАЧИ СРОЧНО!!!");
        System.out.println(emp4.getName() +" "+emp4.getSalary());
        emp4.doTask();
        System.out.println("--------------------------------------");

    }

}
