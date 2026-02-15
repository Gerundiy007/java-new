package org.example.lesson5.homework5.operation1;

public class ComputerList {
    public static void main(String[] args) {

        final Computer computer1 = new Computer("Intel i5-10400", 16, "NVIDIA GTX 1660", 600);

        final Computer computer2 = new Computer("Intel i7-12700K", 32, "NVIDIA RTX 4070", 850);

        final Computer computer3 = new Computer("AMD Ryzen 5 5600X", 16, "AMD RX 6600", 650);

        final Computer computer4 = new Computer("AMD Ryzen 9 7900X", 64, "NVIDIA RTX 4090", 1000);

        final Computer computer5 = new Computer("Intel i3-10100", 8, "Integrated Graphics", 500);

        System.out.println("Рефлексивность:");
        System.out.println("computer1.equals(computer1) = " + computer1.equals(computer1));

        System.out.println("Симметричность:");
        System.out.println("computer1.equals(computer2) = " + computer1.equals(computer2));
        System.out.println("computer2.equals(computer1) = " + computer2.equals(computer1));

        System.out.println("Консистентность:");
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.equals(computer2));

    }
}