package com.company.HeadFirstJava.GuessGameDesign;

public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public void startGame() {
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I thought of number from 0 to 9 ....");

        while (true) {
            player1.guess();
            player2.guess();
            player3.guess();

            guessp1 = player1.number;
            guessp2 = player2.number;
            guessp3 = player3.number;


            System.out.println("First player thinks it is " + guessp1);
            System.out.println("Second player thinks it is " + guessp2);
            System.out.println("Third player thinks it is " + guessp3);


            if(guessp1 == targetNumber) {
                p1IsRight = true;
            }
            if(guessp2 == targetNumber) {
                p2IsRight = true;
            }
            if(guessp3 == targetNumber) {
                p3IsRight = true;
            }

            System.out.println("Hidden number: " + targetNumber);

            if(p1IsRight || p3IsRight || p2IsRight) {
                System.out.println("First player guessd true? " + p1IsRight);
                System.out.println("Second player guessd true? " + p2IsRight);
                System.out.println("Third player guessd true? " + p3IsRight);
                System.out.println("Game was ended");

                break;
            } else {
                System.out.println("One more time to guess");
                break;
            }





        }



    }

}
