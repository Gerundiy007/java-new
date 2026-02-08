package org.example.homework5;

public class EmployeeExecutor {
    public static void main(String[] args) {
        Employee emp1 = new SA();
        emp1.setName("Глеб");
        emp1.setSalary(500);
        emp1.setTask("Системный анализ 8.07.2");
        System.out.println(emp1.getName() +" "+emp1.getSalary());
        emp1.doTask();
        System.out.println("--------------------------------------");

        Employee emp2 = new BA();
        emp2.setName("Игорь");
        emp2.setSalary(50000);
        emp2.setTask("Бизнес анализ 2.1.1");
        System.out.println(emp2.getName() +" "+emp2.getSalary());
        emp2.doTask();
        System.out.println("--------------------------------------");

        Employee emp3 = new BE();
        emp3.setName("Ярослав");
        emp3.setSalary(9999999);
        emp3.setTask("Разработка микросервиса");
        System.out.println(emp3.getName() +" "+emp3.getSalary());
        emp3.doTask();
        System.out.println("--------------------------------------");

        Employee emp4 = new QA();
        emp4.setName("Денис");
        emp4.setSalary(-10000000);
        emp4.setTask("ВЗЯТЬ ВСЕ ЗАДАЧИ СРОЧНО!!!");
        System.out.println(emp4.getName() +" "+emp4.getSalary());
        emp4.doTask();
        System.out.println("--------------------------------------");

    }

}
