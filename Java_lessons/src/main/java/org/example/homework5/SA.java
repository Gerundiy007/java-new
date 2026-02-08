package org.example.homework5;



public class SA implements Emoloyee {
    private String taskName;
    public SA() {
    }
    public SA(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Глеб";
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
        return 100;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }
}
