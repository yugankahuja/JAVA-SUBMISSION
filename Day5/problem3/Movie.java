package com.ey.problem3;


public class Movie {
    private String name;
    private String date;
    private String director;
    private String producer;
    private double duration;

    public Movie(String name, String date, String director, String producer, double duration) {
        this.name = name;
        this.date = date;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", date=" + date + ", director=" + director + ", producer=" + producer
                + ", duration=" + duration + "]";
    }
}

