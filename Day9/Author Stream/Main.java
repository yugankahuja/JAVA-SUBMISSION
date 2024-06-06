package com.ey;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Author> authors = Arrays.asList(
                new Author(123456789012L, "Sharma", "Kumar", "Rishi", LocalDate.of(1985, 5, 10), "female", "New Delhi", 1234567890L),
                new Author(123456789013L, "Mayank", "AD", "Rishi", LocalDate.of(1990, 3, 15), "male", "Uttar Pradesh", 1234567891L),
                new Author(123456789014L, "Sharma", "Tandon", "Rishi", LocalDate.of(1975, 7, 20), "female", "Haryana", 1234567892L)
        );

        AuthorService authorService = new AuthorServiceImpl();

        // Get unique surnames in uppercase
        Set<String> uniqueSurnames = authorService.getUniqueSurnames(authors);
        System.out.println("Unique Surnames: " + uniqueSurnames);

        // Get authors by city
        List<Author> authorsByCity = authorService.getAuthorsByCity(authors, "New Delhi");
        System.out.println("Authors in New Delhi: " + authorsByCity);

        // Get average age of female authors
        double femaleAverageAge = authorService.femaleAverageAge(authors);
        System.out.println("Average Age of Female Authors: " + femaleAverageAge);

        // Get mobile number by Aadhaar card
        Long mobileNumber = authorService.getMobileByAdhar(authors, 123456789012L);
        System.out.println("Mobile Number for Aadhaar 123456789012: " + mobileNumber);
    }
}
