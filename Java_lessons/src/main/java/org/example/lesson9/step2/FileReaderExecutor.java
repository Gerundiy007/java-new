package org.example.lesson9.step2;

import java.io.IOException;

/**
 * Главный метод, здесь создаем FileReader и пробуем прочитать файл с обработкой ошибки.
 */
public class FileReaderExecutor {
    public static void main(String[] args) {
        final var fileReader = new FileReader();
        try {
            final var result = fileReader.readFile("src/main/java/ru/lessons/lesson9/План.txt");
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
