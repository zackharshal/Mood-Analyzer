package org.example;

import java.util.Locale;
public class MoodAnalyzer {

    enum Mood{
        HAPPY, SAD
    }
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
            if(message.equals("")){
                throw new MoodAnalysisException("EMPTY");
            }
            Mood sad = Mood.SAD;
            Mood happy = Mood.HAPPY;
            message = message.toUpperCase();
            if(message.contains(sad.toString())){
                result = "SAD";
            }else if(message.contains(happy.toString())){
                result = "HAPPY";
            }else{
                result = "";
            }

        }catch (MoodAnalysisException e){
            result = e.getMessage();
        }catch (NullPointerException e){
            result = "NULL";

        }
        return result;

    }
}