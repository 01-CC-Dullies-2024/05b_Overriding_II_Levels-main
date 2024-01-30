package com.cc.java;

public class C_Level_3 {
    
    private String levelName = "Level 3";
    protected int points;

    public String play() {

        points++;
        return "Yahoo, " + levelName + " here, and I have " + points + " points!";
    }

}

