package com.idealista.hackathon;

public class Main {

    public static void main(String args[]) {

        GameReader gameReader = new GameReader();
        Game game = gameReader.read();






        WorldOutput worldOutput = new WorldOutput();
        worldOutput.result(game.getWorld());


        //TODO leer fichero <World, List<Command>>
        //TODO foreach command -> commandprocessor
        //TODO por consola sacar el World
    }

}
