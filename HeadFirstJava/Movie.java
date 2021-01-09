package com.company.HeadFirstJava;

public class Movie {
    // Let's think about what movie does and has
    // Movie has title, duration, genre

    public String title;
    public int duration;
    public String genre;
    int rating;

    // Movie can show use film
    public void playMovie() {
        System.out.println("Playing movie has been started");
    }
}
