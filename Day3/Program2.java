package com.ey.ui;
import java.util.Scanner;

public class Program2 {

    public static Integer findMaxDistance(int[] array, int n) {
        if (array == null || n < 2) {
            return null;  
        }

        int maxDifference = 0;
        int index = -1;

        for (int i = 0; i < n - 1; i++) {
            int difference = Math.abs(array[i] - array[i + 1]);
            if (difference > maxDifference) {
                maxDifference = difference;
                index = array[i] > array[i + 1] ? i : i + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Integer result = findMaxDistance(array, n);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}