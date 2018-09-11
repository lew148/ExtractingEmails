package com.company;

import java.io.IOException;
import java.util.HashMap;
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


        //@\w*\.com|co\.uk

        HashMap<String, Integer> domainMap = new HashMap<>();

        Pattern domainPattern = Pattern.compile("@(\\w*(\\.com|\\.co\\.uk))");
        Matcher domainMatcher = domainPattern.matcher(inputtext);


        while (domainMatcher.find()) {
            String domainName = domainMatcher.group(1);
            int startValue = 0;

            if (domainMap.containsKey(domainName) == true) {
                int value = domainMap.get(domainName);
                domainMap.put(domainName, value+1);
            } else {
                domainMap.put(domainName, startValue);
            }
        }



        System.out.println(domainMap);


    }
}
