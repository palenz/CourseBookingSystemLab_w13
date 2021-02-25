package com.codeclan.example.CourseBookingSystem.models;

public class Course {

    private Long id;
    private String name;
    private String town;
    private double rating;

    public Course(String name, String town, double rating) {
        this.name = name;
        this.town = town;
        this.rating = rating;
        this.id = id;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
