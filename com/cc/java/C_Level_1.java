package com.cc.java;

public class C_Level_1 extends C_Level_2{

    private String levelName = "Level 1";
    private int levelPoints = 3;

    public String play() {
       
        if (points < this.levelPoints) {
            points++;
            return "Yahoo, " + levelName + " here, and I have " + points + " points!";
        } else {
            return super.play();
        }
    }

    
}

