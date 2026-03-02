package org.example.lesson9.step4;

/**
 * Конструктор создает исключение с переданным сообщением об ошибке.
 */
public class BankAccountException extends RuntimeException {
    public BankAccountException(String message) {
        super(message);
    }
}
