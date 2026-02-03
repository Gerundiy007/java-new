package org.example.lesson3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        String name = person.getFirstName();
        System.out.println(name);

        Person person1 = new Person("Иван","Иванов");
        String name1 = person1.getFirstName();
        person1.setAge(22);
        person1.voice();
        int age = person1.getAge();
        System.out.println(name1);

        System.out.println(Person.className);

        final Person person2 = new Person();

        final User user = new User("Петя","Петров");
        System.out.println(user.getFirstName());
    }
}
