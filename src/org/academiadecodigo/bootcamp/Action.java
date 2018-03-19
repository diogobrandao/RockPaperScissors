package org.academiadecodigo.bootcamp;

public class Action {




    public void start(Player p1, Player p2, int turns) {

        Game choice1;
        Game choice2;

        for(int i = 0; i < turns;i++) {

            choice1 = p1.pick();
            choice2 = p2.pick();



        switch (choice1) {



            case ROCK:
                System.out.println("Rock");
                break;

            case PAPER:
                System.out.println("Paper");
                break;

            case SCISSORS:
                System.out.println("Scissors");
                break;

        }


        if(choice1 == Game.ROCK) {
            if(choice2 == Game.PAPER) {
                System.out.println("Player 2 wins");
            } if(choice2 == Game.SCISSORS){
                System.out.println("Player 1 wins");
            } if(choice2 == Game.ROCK){
                System.out.println("Its a draw");
            }
        }

        if(choice1 == Game.PAPER) {
            if(choice2 == Game.ROCK) {
                System.out.println("Player 1 wins");
            } if(choice2 == Game.SCISSORS){
                System.out.println("Player 2 wins");
            } if(choice2 == Game.PAPER) {
                System.out.println("It's a draw");
            }

         if(choice1 == Game.SCISSORS) {
                if(choice2 == Game.ROCK) {
                    System.out.println("Player 1 wins");
                } if(choice2 == Game.PAPER) {
                 System.out.println("Player 2 wins");
             } if(choice2 == Game.SCISSORS);
         }

        }

    }



    }
}




