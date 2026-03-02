package org.example.lesson9.step2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Метод читает файл по указанному пути и возвращает его содержимое в виде строки.
 */
public class FileReader {
    public String readFile(String path) throws IOException {
        return Files.readString(Path.of(path), StandardCharsets.UTF_8);
    }
}
