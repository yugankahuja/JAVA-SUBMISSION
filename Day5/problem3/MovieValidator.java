package com.ey.problem3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DirectorComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie a, Movie b) {
        return a.getDirector().compareTo(b.getDirector());
    }
}

class ProducerComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie a, Movie b) {
        return a.getProducer().compareTo(b.getProducer());
    }
}

public class MovieValidator {
    List<Movie> movieList = new ArrayList<>();

    public String addMovie(Movie m) {
        movieList.add(m);
        return "Addition Completed";
    }

    public void list() {
        movieList.forEach(x -> System.out.println(x));
    }

    public void sortByDirector() {
        Collections.sort(movieList, new DirectorComparator());
        list();
    }

    public void sortByProducer() {
        Collections.sort(movieList, new ProducerComparator());
        list();
    }
}

