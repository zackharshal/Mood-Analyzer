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

    public String analyseMood() {
        String result = "";
        try{
            message = message.toLowerCase();
            if(message.contains("sad")){
                result = "SAD";
            }else if(message.contains("happy")){
                result = "HAPPY";
            }else{
                result = "";
            }
        }catch (NullPointerException e){
            result = "HAPPY";
        }
        return result;

    }
}