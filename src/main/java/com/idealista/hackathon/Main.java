package com.idealista.hackathon;

public class Main {

    public static void main(String args[]) {

        GameReader gameReader = new GameReader();
        Game game = gameReader.read();

        World currentWorld = game.getWorld();
        for (Command command : game.getCommands()) {
            currentWorld = command.execute(currentWorld);
        }

        WorldOutput worldOutput = new WorldOutput();
        worldOutput.result(game.getWorld());

    }

}
