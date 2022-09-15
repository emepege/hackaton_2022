package com.idealista.hackathon;

import java.util.List;

public class Game {

    private World world;
    private List<Command> commands;

    public Game(World world, List<Command> commands) {
        this.world = world;
        this.commands = commands;
    }

    public World getWorld() {
        return world;
    }

    public List<Command> getCommands() {
        return commands;
    }
}
