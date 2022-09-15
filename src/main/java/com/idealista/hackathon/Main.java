package com.idealista.hackathon;

public class Main {

    public static void main(String args[]) {

        GameReader gameReader = new GameReader();
        Game game = gameReader.read();

        World world = game.getWorld();
        world.getSurvivors().size();
        world.getZombies().size();
        world.getItems().size();
        //world.getCommands.getSize();

        //TODO leer fichero <World, List<Command>>
        //TODO foreach command -> commandprocessor
        //TODO por consola sacar el World
    }

}
