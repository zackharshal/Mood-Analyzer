package org.example;

import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MoodAnalyzer {
    public static void main(String[] args) {

    }

    public String analyseMood(String message) {
        message = message.toLowerCase();
        if(message.contains("sad")){
            return "SAD";
        }else if(message.contains("happy")){
            return "HAPPY";
        }else{
            return "";
        }
    }
}