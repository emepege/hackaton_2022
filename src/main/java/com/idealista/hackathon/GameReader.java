package com.idealista.hackathon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameReader {

    public Game read() {

        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("/home/smsempere/IdeaProjects/hackathon/hackaton_2022/example.txt"));
            String line = reader.readLine();

            // Instrucciones iniciales
            String[] instrucciones1 = line.split(" ");
            int players = Integer.parseInt(instrucciones1[0]);
            int zombies = Integer.parseInt(instrucciones1[1]);
            int items = Integer.parseInt(instrucciones1[2]);
            int worldSize = Integer.parseInt(instrucciones1[3]);
            int nCommands = Integer.parseInt(instrucciones1[4]);

            int createdPlayers = 0;
            int createdZombies = 0;
            int createdItems = 0;
            int createdCommands = 0;

            World world = new World(worldSize);
            List<Command> commands = new ArrayList<>();

            line = reader.readLine();
            while (line != null) {
                if (createdPlayers < players) {
                    world.addSurvivor(parseSurvivor(reader, line));
                    createdPlayers++;
                } else if (createdZombies < zombies) {
                    world.addZombie(parseZombie(line));
                    createdZombies++;
                } else if (createdItems < items) {
                    world.addItem(parseItem(line));
                    createdItems++;
                } else if (createdCommands < nCommands) {
                    commands.add(parseCommand(line));
                    createdCommands++;
                }

                System.out.println(line);
                // read next line
                line = reader.readLine();

            }

            reader.close();

            return new Game(world, commands);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }

    private Survivor parseSurvivor(BufferedReader reader, String line) throws IOException {
        String[] instrucciones1 = line.split(" ");
        int life = Integer.parseInt(instrucciones1[0]);
        int xp = Integer.parseInt(instrucciones1[1]);
        int nitems = Integer.parseInt(instrucciones1[2]);
        int x = Integer.parseInt(instrucciones1[3]);
        int y = Integer.parseInt(instrucciones1[4]);
        String name = instrucciones1[5];
        Survivor survivor = new Survivor(name, new Point(x, y), life, xp);

        for (int i = 0; i < nitems; i++) {
            String[] itemArray = line.split(" ");
            line = reader.readLine();
            String itemName = itemArray[0];
            int itemPlace = Integer.parseInt(itemArray[1]); // TODO
            Item item = new Item(itemName);
            survivor.addItemOnBackpack(item);
        }

        return survivor;

    }

    private Zombie parseZombie(String line) {
        String[] instrucciones1 = line.split(" ");
        String name = instrucciones1[0];
        int x = Integer.parseInt(instrucciones1[1]);
        int y = Integer.parseInt(instrucciones1[2]);
        return new Zombie(name, new Point(x, y));
    }

    private Item parseItem(String line) {
        String[] instrucciones1 = line.split(" ");
        String name = instrucciones1[0];
        int x = Integer.parseInt(instrucciones1[1]);
        int y = Integer.parseInt(instrucciones1[2]);
        return new Item(name, new Point(x, y));
    }

    private Command parseCommand(String line) {
        String[] instrucciones1 = line.split(" ");
        String type = instrucciones1[0];
        if ("M".equals(type)) {
            String name = instrucciones1[1];
            String direction = instrucciones1[2];
            return new MovementCommand(name, Direction.valueOf(direction.toUpperCase()));
        } else {
            String name = instrucciones1[1];
            String direction = instrucciones1[2];
            return new MovementCommand(name, Direction.valueOf(direction.toUpperCase()));
        }
    }
}