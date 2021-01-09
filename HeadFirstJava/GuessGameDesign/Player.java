package com.company.HeadFirstJava.GuessGameDesign;

public class Player {
    public int number;

    public void guess() {
        this.number = (int)(Math.random() * 10);
    }
}
