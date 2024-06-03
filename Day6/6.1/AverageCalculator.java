package com.ey;

public class AverageCalculator {
    public double calAverage(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }
        
        int sum = (n * (n + 1)) / 2;
        
        double average = (double) sum / n;
        
        return average;
    }
}
