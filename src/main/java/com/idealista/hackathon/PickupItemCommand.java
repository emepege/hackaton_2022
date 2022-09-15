package com.idealista.hackathon;

public class PickupItemCommand implements Command {

    private final String character;
    private final String item;
    private final ItemPlace itemPlace;

    public PickupItemCommand(String character, String item, ItemPlace itemPlace) {
        this.character = character;
        this.item = item;
        this.itemPlace = itemPlace;
    }

    public World execute(World world) {
        //TODO
        return world;
    }
}
