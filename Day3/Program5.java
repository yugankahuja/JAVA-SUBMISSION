package com.ey.ui;

import java.util.Scanner;

public class Program5 {

    public static String getLastLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char lastChar = word.charAt(word.length() - 1);
                result.append(Character.toUpperCase(lastChar));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputSentence = scanner.nextLine();

        String result = getLastLetter(inputSentence);

        System.out.println(result);

        scanner.close();
    }
}
