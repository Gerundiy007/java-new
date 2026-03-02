package org.example.lesson9.step1;

/**
 * Главный метод, здесь создаем объект Person и проверяем обработку ошибки при неверном email.
 */
public class PersonBuilder {
    public static void main(String[] args) {
        try {
            final var person = new Person();
            person.setEmail("email");
            System.out.println(person);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
