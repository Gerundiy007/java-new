package org.example.homework5;

public class BE implements Emoloyee{
    private String taskName;
    public BE() {
    }
    public BE(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Ярослав";
    }

    @Override
    public String getTask() {
        return taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Взять задачу "+taskName+ " в работу");

    }

    @Override
    public double getSalary() {
        return 99999999;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }
}
