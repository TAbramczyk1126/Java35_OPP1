package org.cinema;

public class ScreeningShow {
    public static void main(String[] args) {

        final Movie movie1 = new Movie();

        movie1.title = "The Godfather";
        movie1.director = "Francis Ford Coppola";
        movie1.duration = 175;
        movie1.year = 1972;

        System.out.println(movie1.movieInfo());

        final Movie movie2 = new Movie();

        movie2.title = "The Godfather: Part II";
        movie2.director = "Francis Ford Coppola";
        movie2.duration = 202;
        movie2.year = 1974;

        System.out.println(movie2.movieInfo());
    }
}
