package org.academiadecodigo.bootcamp;

public class Player {
    private String name;

    public Player(String name) {

        this.name = name;
    }

    public Game pick() {
        int r=  Random.getRandom();
        return Game.values()[r];

    }


    public String getName()
    {
        return this.name;
    }

}
