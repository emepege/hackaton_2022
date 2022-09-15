package com.idealista.hackathon;

import java.util.ArrayList;
import java.util.List;

public class Survivor {

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
}
