package org.example.homework5;

public class BA implements Emoloyee{
    private String taskName;
    public BA() {
    }

    public BA(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Игорь";
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
        return 200;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }
}
