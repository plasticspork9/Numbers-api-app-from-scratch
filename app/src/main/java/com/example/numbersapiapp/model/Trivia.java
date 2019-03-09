package com.example.numbersapiapp.model;

public class Trivia {
    String text;
    int number;
    boolean found;
    String type;

    public Trivia(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFound() {
        return found;
    }

    public String getType() {
        return type;
    }
}
