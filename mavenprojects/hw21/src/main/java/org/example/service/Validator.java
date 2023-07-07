package org.example.service;

public class Validator {
    public static boolean isGameMaxNumberCorrect(String str) {
        int gameMaxNum;
        try {
            gameMaxNum = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return gameMaxNum > 0;
    }
}
