package com.ey.ui;

public class Program1 {

    public static String getCapitalized(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.length() > 1 ? word.substring(1).toLowerCase() : "";
                capitalizedSentence.append(firstChar).append(restOfWord).append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String inputSentence = "now is the time to act!";
        
        String result = getCapitalized(inputSentence);
        
        System.out.println(result);
    }
}


