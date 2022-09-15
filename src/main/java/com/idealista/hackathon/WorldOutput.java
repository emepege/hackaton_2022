package com.idealista.hackathon;

public class WorldOutput {

    public void result(World world){


        StringBuilder outputLog = new StringBuilder();
        outputLog.append(world.getSurvivors().size() + " " +  world.getZombies().size() + " " +  world.getItems().size() + " " + world.getSize() + " " + world.getCommands().size() + "/n");

    }
}
