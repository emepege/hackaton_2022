package com.idealista.hackathon;

public class MoveItemCommand implements Command {

    private final String character;
    private final Item item;
    private final ItemPlace itemPlace;

    public MoveItemCommand(String character, Item item, ItemPlace itemPlace) {
        this.character = character;
        this.item = item;
        this.itemPlace = itemPlace;
    }

    public World execute(World world) {
        //TODO
        return world;
    }
}
