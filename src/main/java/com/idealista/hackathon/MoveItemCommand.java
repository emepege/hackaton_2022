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
        Survivor s = world.getSurvivor(character);
        if (ItemPlace.LEFTHAND.equals(itemPlace)) {
            if (s.getLeftHandItem() != null) return world;
            s.setLeftHandItem(item);
        } else if (ItemPlace.RIGHTHAND.equals(itemPlace)) {
            if (s.getRightHandItem() != null) return world;
            s.setRightHandItem(item);
        } else if (ItemPlace.BACKPACK.equals(itemPlace)) {
            if (s.getBackpack().size() > 2) return world;
            s.getBackpack().add(item);
        } else {
            world.addItem(new Item(item.getNombre(), new Point(s.getPoint().getX(), s.getPoint().getY())));
        }
        return world;
    }
}
