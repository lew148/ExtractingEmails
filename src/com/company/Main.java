package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Utilities.readFile("C:\\Work\\Training\\ExtractingEmails\\sampletext.txt");
        } catch (IOException e) {
            System.out.println("An error has occurred! File may not exist.");
        }
    }
}
