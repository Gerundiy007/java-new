//д/з 1. Создать класс Computer (int id, String cpu, int ram, String videoCard, int power), переопределить методы equlals(), toString(), hashCode(), реализуйте 3 версии класса (x,y,z);
//2. Проверить правильность переопределения метода equlals():
//a) Рефлексивность: x.equals(x) должен возвращать true;
//b) Симметричность: если x.equals(y) возвращает true, то y.equals(x) тоже должен возвращать true;
//c) Консистентность: повторные вызовы x.equals(y) должны возвращать одинаковый результат, если объекты не изменились;
//
//2. Реализовать класс коннектор к БД CassandraDBConnector implements DBConnector;


package org.example.lesson5.homework5.operation1;

import java.util.Objects;
import java.util.UUID;

public class Computer {
   private UUID id;
    private String cpu;
    private int ram;
    private String graphicsСard;
    private int power;

    public Computer() {
    }

    public Computer(String cpu, int ram, String graphicsСard, int power) {
        this.id = UUID.randomUUID();
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsСard = graphicsСard;
        this.power = power;
    }

    public UUID getId() {
        return id;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsСard() {
        return graphicsСard;
    }

    public void setGraphicsСard(String graphicsСard) {
        this.graphicsСard = graphicsСard;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", graphicsСard='" + graphicsСard + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && power == computer.power && Objects.equals(cpu, computer.cpu) && Objects.equals(graphicsСard, computer.graphicsСard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, graphicsСard, power);
    }
}
