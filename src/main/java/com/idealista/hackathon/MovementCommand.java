package com.idealista.hackathon;

public class MovementCommand {

    private final String character;
    private final Direction direction;

    public MovementCommand(String character, Direction direction) {
        this.character = character;
        this.direction = direction;
    }
}
