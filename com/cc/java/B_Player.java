package com.cc.java;

public class B_Player {
   
    // attribute field
    private Integer Strength;
    private Integer Dexterity;
    private Integer Health;
    private Integer Points;

    //constructor for attributes in field
    public B_Player(Integer strength, Integer dexterity, Integer health, Integer points) {
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Health = health;
        this.Points = points;
    }

    //getters and setters for attributes
    public Integer getStrength() {
        return this.Strength;
    }

    protected void setStrength(Integer strength) {
        this.Strength = strength;
    }

    public Integer getDexterity() {
        return this.Dexterity;
    }

    protected void setDexterity(Integer dexterity) {
        this.Dexterity = dexterity;
    }

    public Integer getHealth() {
        return this.Health;
    }

    protected void setHealth(Integer health) {
        this.Health = health;
    }
   
    public Integer getPoints() {
        return this.Points;
    }

    protected void setPoints(Integer points) {
        this.Points = points;
    }

    public String play() {
        // setPoints();
        switch (this.Points) {
            case 0: {
                return "Yahoo, " + " Just started with " + this.getPoints() + " points!"; }
            case 1: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 2: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 3: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 4: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 5: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 6: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 7: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 8: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 9: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            case 10: {
                return "Yahoo, " + " here, and I have " + this.getPoints() + " points!"; }
            }
        }

        //output attributes when level up
        public String levelUp() {
            return "Level UP! " + "Strength: " + this.getStrength() + " Dexterity " + this.getDexterity() + " Health " + this.getHealth();
        }



}

