package com.company;

public class Utilities {

    public static void readFile(String[] args) {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes);

    }
}
