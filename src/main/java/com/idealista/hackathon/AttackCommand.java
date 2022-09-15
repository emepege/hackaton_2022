package com.idealista.hackathon;

public class AttackCommand implements Command {

    private final String attacker;
    private final String defender;
    private final String item;
    private final boolean success;

    public AttackCommand(String attacker, String defender, String item, boolean success) {
        this.attacker = attacker;
        this.defender = defender;
        this.item = item;
        this.success = success;
    }

    public World execute(World world) {
        //TODO
        return world;
    }

}
