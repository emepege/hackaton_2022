package com.idealista.hackathon;

import java.util.HashMap;
import java.util.Map;

public class World {

    public int size;
    public Map<String, Zombie> zombies;
    public Map<String, Survivor> survivors;
    public Map<String, Item> items;

    public World(int size) {
        this.size = size;
        this.zombies = new HashMap<>();
        this.survivors = new HashMap<>();
        this.items = new HashMap<>();
    }

    public void addSurvivor(Survivor survivor) {
        survivors.put(survivor.getNombre(), survivor);
    }

    public void addZombie(Zombie zombie) {
        zombies.put(zombie.getNombre(), zombie);
    }

    public void addItem(Item item) {
        items.put(item.getNombre(), item);
    }

}
