package com.idealista.hackathon;

public class Item {

    private String nombre;
    private Point point;

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public Item(String nombre, Point point) {
        this.nombre = nombre;
        this.point = point;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", nombre, point.getX(), point.getY());
    }
}
