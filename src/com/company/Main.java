package com.company;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String inputtext = "";

        try {
            inputtext = Utilities.readFile("C:\\Work\\Training\\ExtractingEmails\\sampletext.txt");
        } catch (IOException e) {
            System.out.println("An error has occurred! File may not exist.");
        }


        Pattern emailPattern = Pattern.compile("\\W(\\w|[.'_%+-])+@softwire\\.com\\W");
        Matcher emailMatcher = emailPattern.matcher(inputtext);

        int counter = 0;

        while (emailMatcher.find()) {
            counter = counter + 1;

        }

System.out.println(counter);
        //@\w*.com|co.uk


    }
}
