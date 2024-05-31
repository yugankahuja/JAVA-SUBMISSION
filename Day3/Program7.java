package com.ey.ui;

import java.util.Scanner;

public class Program7 {

    public static String convertFormat(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 12 || !phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}")) {
            return "Invalid input";
        }

        String digitsOnly = phoneNumber.replace("-", "");
        
        String part1 = digitsOnly.substring(0, 2);
        String part2 = digitsOnly.substring(2, 4);
        String part3 = digitsOnly.substring(4, 7);
        String part4 = digitsOnly.substring(7, 10);

        return part1 + "-" + part2 + "-" + part3 + "-" + part4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPhoneNumber = scanner.nextLine();

        String result = convertFormat(inputPhoneNumber);

        System.out.println(result);

        scanner.close();
    }
}