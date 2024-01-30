package com.cc.java;

public class App {
    public static void main(String[] args) {
    
        B_Player b_player = new B_Player(
            1,
            1,
            1,
            0
        );
        
        // Variante 1
        // for (int i = 0; i < 12; i++) {
        //     output(b_player.play());  
        // }

        // Variante 2
        while (b_player.getPoints() < 11) {
            output(b_player.play()); 
        }

        // methode output level up
        output(b_player.levelUp());

    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }

    // private static void output(Integer outStr) {
    //     System.out.println(outStr);
    // }


}

