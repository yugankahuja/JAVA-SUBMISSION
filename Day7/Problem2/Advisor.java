package com.ey.problem2;


import java.util.Random;

public class Advisor {

 public static void main(String[] args) {
     String[] advices = {
         "Never begin to stop and never stop to begin.",
         "Only destination isn’t important, one should enjoy the journey.",
         "Impossible itself says ‘I am possible’."
     };

     Random random = new Random();

     int randomIndex = random.nextInt(advices.length);

     System.out.println("Advice: " + advices[randomIndex]);
 }
}
