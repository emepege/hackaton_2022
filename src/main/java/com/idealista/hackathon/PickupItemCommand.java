package com.idealista.hackathon;

public class PickupItemCommand implements Command {

    private final String character;
    private final Item item;
    private final ItemPlace itemPlace;

    public PickupItemCommand(String character, Item item, ItemPlace itemPlace) {
        this.character = character;
        this.item = item;
        this.itemPlace = itemPlace;
    }

    public World execute(World world) {
        Survivor survivor = world.getSurvivor(character);
        if (survivor == null) return world;
        if (ItemPlace.LEFTHAND.equals(itemPlace)) {
            survivor.setLeftHandItem(item);
        } else if (ItemPlace.RIGHTHAND.equals(itemPlace)) {
            survivor.setRightHandItem(item);
        } else {
            if (survivor.getBackpack().size() == 3) return world;
            survivor.getBackpack().add(item);
        }
        return world;
    }

    @Override
    public String toString() {
        return String.format("P %s", character);
    }
}
