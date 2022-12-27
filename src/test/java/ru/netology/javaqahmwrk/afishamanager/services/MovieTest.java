package ru.netology.javaqahmwrk.afishamanager.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void addMovieTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};


        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowLimitTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
//                {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"}

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLessLimitTest() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");


        String[] actual = manager.findLast();
        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLimitAboveMaxTest() {
        MovieManager manager = new MovieManager();

//        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        manager.addMovie("Film 8");
        manager.addMovie("Film 9");
        manager.addMovie("Film 10");
        manager.addMovie("Film 11");

        String[] actual = manager.findLast();
        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }
}