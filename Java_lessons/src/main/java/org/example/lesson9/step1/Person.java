package org.example.lesson9.step1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    /**
     * Метод устанавливает имя и проверяет, чтобы оно не было пустым.
     */
    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя пустое");
        }
        this.firstname = firstname;
    }

    /**
     * Метод устанавливает фамилию и проверяет, чтобы она не была пустой.
     */
    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия пустая");
        }
        this.lastname = lastname;
    }

    /**
     * Метод устанавливает возраст и проверяет, чтобы он был от 0 до 100.
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неверный возраст");
        }
        this.age = age;
    }

    /**
     * Метод устанавливает email и проверяет, чтобы он содержал символ '@'.
     */
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email невалидный формат");
        }
        this.email = email;
    }
}
