package org.example.homework5;

public class QA implements Emoloyee{
    private String taskName;
    public QA() {
    }
    public QA(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Денис";
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
        return -100000000;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }
}
