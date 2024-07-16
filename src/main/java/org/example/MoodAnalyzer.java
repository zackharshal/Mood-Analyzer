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
        boolean result;
        try{
            message = message.toLowerCase();
            if(message.contains("sad")){
                result = false;
            }else if(message.contains("happy")){
                result = true;
            }
        }catch (NullPointerException e){
            result = true;
        }
        return result;

    }
}
