package com.idealista.hackathon;

import java.util.List;
import java.util.Map;

public class WorldOutput {

    public void result(World world){

        System.out.println(world.getSurvivors().size() + " " +  world.getZombies().size() + " " +  world.getItems().size() + " " + world.getSize() + " " + world.getCommands().size());
        Map<String, Survivor> survivors = world.getSurvivors();
        survivors.forEach((name, survivor) -> {
            System.out.println(survivor.toString());
        });
        Map<String, Zombie> zombies = world.getZombies();
        zombies.forEach((name, zombie) -> {
            System.out.println(zombie.toString());
        });

        Map<String, Item> items = world.getItems();
        items.forEach((name, item) -> {
            System.out.println(item.toString());
        });

        for(Command command : world.getCommands()) {
            System.out.println(command.toString());
        }

    }
}
