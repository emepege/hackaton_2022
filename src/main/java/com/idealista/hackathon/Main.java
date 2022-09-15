package com.idealista.hackathon;

public class Main {

    public static void main(String args[]) {

        GameReader gameReader = new GameReader();
        Game game = gameReader.read();

        StringBuilder outputLog = new StringBuilder();
        World world = game.getWorld();
        outputLog.append(world.getSurvivors().size() + " " +  world.getZombies().size() + " " +  world.getItems().size() + " " + world.getSize() + " " + world.getCommands().size() + "/n");
        






        //TODO leer fichero <World, List<Command>>
        //TODO foreach command -> commandprocessor
        //TODO por consola sacar el World
    }

}
