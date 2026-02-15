package org.example.lesson4.homework4;

public class BE implements Employee {
    private String name;
    private String taskName;
    private double salary;

    public BE() {
    }

    public BE(String name, String taskName, double salary) {
        this.name = name;
        this.taskName = taskName;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTask() {
        return taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Взять задачу " + taskName + " в работу");
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
