package com.idealista.hackathon;

public class MovementCommand implements Command {

    private final String name;
    private final Direction direction;

    public MovementCommand(String name, Direction direction) {
        this.name = name;
        this.direction = direction;
    }

    public World execute(World world) {
        Character character = world.getCharacter(name);
        if (isValidMovement(world, character, direction)) {
            character.move(direction);
            world.addCommand(this);
        }
        return world;
    }

    private boolean isValidMovement(World world, Character character, Direction direction) {
        if (character == null) return false;
        Point point = character.getPoint().move(direction);
        if (point.getX() > world.getSize() || point.getX() < 0) return false;
        if (point.getY() > world.getSize() || point.getY() < 0) return false;
        return true;
    }

    @Override
    public String toString() {
        String dir = direction.toString().toLowerCase();
        return String.format("M %s %s", name, dir.substring(0, 1).toUpperCase() + dir.substring(1));
    }
}
