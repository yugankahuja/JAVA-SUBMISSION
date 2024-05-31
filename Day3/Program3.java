package com.ey.ui;

import java.util.Scanner;

public class Program3 {

    public static Boolean validatePAN(String pan) {
        if (pan == null || pan.length() != 8) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isUpperCase(pan.charAt(i)) || !Character.isLetter(pan.charAt(i))) {
                return false;
            }
        }

        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(pan.charAt(i))) {
                return false;
            }
        }

        if (!Character.isUpperCase(pan.charAt(7)) || !Character.isLetter(pan.charAt(7))) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pan = scanner.nextLine();

        Boolean isValid = validatePAN(pan);

        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
