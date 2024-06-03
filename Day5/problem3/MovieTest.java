package com.ey.problem3;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        MovieValidator mv = new MovieValidator();

        Movie m1 = new Movie("Singham", "27-07", "HIJ", "123", 2.45);
        Movie m2 = new Movie("Race", "23-08", "EFG", "456", 2.45);
        Movie m3 = new Movie("Mission Impossible", "27-07", "DEF", "789", 2.30);
        Movie m4 = new Movie("Avengers", "25-03", "ABC", "112", 3.00);
        mv.addMovie(m1);
        mv.addMovie(m2);
        mv.addMovie(m3);
        mv.addMovie(m4);

        Scanner sc = new Scanner(System.in);
        System.out.println("1) Add");
        System.out.println("2)Sort by director");
        System.out.println("3)Sort by producer");
        System.out.println("Selected Option:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter the movie name:");
            String name = sc.next();
            System.out.println("Enter the movie date:");
            String date = sc.next();
            System.out.println("Enter the movie director name:");
            String director = sc.next();
            System.out.println("Enter the movie producer name:");
            String producer = sc.next();
            System.out.println("Enter the movie duration:");
            double duration = sc.nextDouble();
            Movie newMovie = new Movie(name, date, director, producer, duration);
            mv.addMovie(newMovie);
            mv.list();
        } else if (choice == 2) {
            mv.sortByDirector();
        } else if (choice == 3) {
            mv.sortByProducer();
        }
    }
}
