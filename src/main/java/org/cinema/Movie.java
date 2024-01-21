package org.cinema;

public class Movie {

    String title;
    String director;
    int duration;
    int year;


    String movieInfo() {
        return title + " - " + director + " - " + duration + " - " + year;
    }
}
