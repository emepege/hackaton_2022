package com.idealista.hackathon;

public class Zombie implements Character {

    private String nombre;
    private Point point;

    public Zombie(String nombre, Point point) {
        this.nombre = nombre;
        this.point = point;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void move(Direction direction) {
        this.point = point.move(direction);
    }

    @Override
    public Point getPoint() {
        return point;
    }
}
