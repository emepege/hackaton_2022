package com.idealista.hackathon;

public class Main {

    public static void main(String args[]) {

        String file = args[0];

        //"/home/smsempere/IdeaProjects/hackathon/hackaton_2022/example.txt"

        GameReader gameReader = new GameReader();
        Game game = gameReader.read(file);

        World currentWorld = game.getWorld();
        for (Command command : game.getCommands()) {
            currentWorld = command.execute(currentWorld);
        }

        WorldOutput worldOutput = new WorldOutput();
        worldOutput.result(game.getWorld());

    }

}
