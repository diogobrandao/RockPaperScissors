package org.academiadecodigo.bootcamp;

public class Player {
    private String name;
    //private int victories = 0;
    public Player(String name) {

        this.name = name;
    }

    public Game pick() {
        int r=  Random.getRandom();
        return Game.values()[r];

    }

    //public void win(){
    //  victories++;

    public String getName()
    {
        return this.name;
    }

}
