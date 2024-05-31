package com.ey.ui;

import java.util.Scanner;

public class Program4 {

    public static String reshape(String input, char separator) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder reshapedString = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reshapedString.append(input.charAt(i));
            if (i > 0) {
                reshapedString.append(separator);
            }
        }

        return reshapedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        char separator = scanner.nextLine().charAt(0);

        String result = reshape(inputString, separator);

        System.out.println(result);

        scanner.close();
    }
}


