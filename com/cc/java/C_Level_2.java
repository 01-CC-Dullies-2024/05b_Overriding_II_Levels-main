package com.cc.java;

public class C_Level_2 extends C_Level_3 {
    
    private String levelName = "Level 2";
    private int levelPoints = 9;

    public String play() {
     
        if (points < this.levelPoints) {
            points++;
            return "Yahoo, " + levelName + " here, and I have " + points + " points!";
        } else {
            return super.play();
        }
    }

  
}

