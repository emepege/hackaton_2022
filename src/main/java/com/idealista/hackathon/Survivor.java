package com.idealista.hackathon;

import java.util.ArrayList;
import java.util.List;

public class Survivor implements Character {

    private final String nombre;
    private Point point;
    private int life;
    private int xp;
    private Item leftHandItem;
    private Item rightHandItem;
    private List<Item> backpack;

    public Survivor(String nombre, Point point, int life, int xp) {
        this.nombre = nombre;
        this.point = point;
        this.life = life;
        this.xp = xp;
        this.backpack = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setLeftHandItem(Item leftHandItem) {
        this.leftHandItem = leftHandItem;
    }

    public void setRightHandItem(Item rightHandItem) {
        this.rightHandItem = rightHandItem;
    }

    public void addItemOnBackpack(Item item) {
        this.backpack.add(item);
    }

    @Override
    public void move(Direction direction) {
        this.point = point.move(direction);
    }

    public int getLife() {
        return life;
    }

    public int getXp() {
        return xp;
    }

    public Item getLeftHandItem() {
        return leftHandItem;
    }

    public Item getRightHandItem() {
        return rightHandItem;
    }

    public List<Item> getBackpack() {
        return backpack;
    }

    private int nItems() {
        int nItems = backpack.size();
        if (leftHandItem != null) nItems++;
        if (rightHandItem != null) nItems++;
        return nItems;
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        String output = String.format("%d %d %d %d %d %s", life, xp, nItems(), point.getX(), point.getY(), nombre);
        for (Item item : backpack) {
            output += String.format("\n%s Backpack", item.getNombre());
        }
        if (leftHandItem != null) {
            output += String.format("\n%s LeftHand", leftHandItem.getNombre());
        }
        if (rightHandItem != null) {
            output += String.format("\n%s RightHand", rightHandItem.getNombre());
        }
        return output;
    }
}
