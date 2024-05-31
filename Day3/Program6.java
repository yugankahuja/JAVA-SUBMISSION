package com.ey.ui;

import java.util.Scanner;

public class Program6 {

    public static int calculateWordSum(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split("\\s+");
        if (words.length == 0) {
            return 0;
        }

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        if (firstWord.equals(lastWord)) {
            return firstWord.length();
        } else {
            return firstWord.length() + lastWord.length();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputSentence = scanner.nextLine();

        int result = calculateWordSum(inputSentence);

        System.out.println(result);

        scanner.close();
    }
}
