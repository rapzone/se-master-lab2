package ru.edu.asu.cars.old;


public class NoSuchCarException extends Exception {

    public NoSuchCarException() {}

    public NoSuchCarException(String msg) {
        super(msg);
    }
}
