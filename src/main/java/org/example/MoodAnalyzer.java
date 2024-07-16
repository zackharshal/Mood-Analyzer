package org.example;

import java.util.Locale;
public class MoodAnalyzer {
    public String message;
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    public MoodAnalyzer() {

    }

    public static void main(String[] args) {

    }

    public boolean analyseMood() {
        message = message.toLowerCase();
        if(message.contains("sad")){
            return false;
        }else if(message.contains("happy")){
            return true;
        }else{
            return "";
        }
    }
}
