package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise31 {

    public class Route {
        public static final String PATH_NAME = "src/main/resources/lorem.txt";
    }

    public static void main(String[] args) {
        Path filePath = Paths.get(Route.PATH_NAME);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

