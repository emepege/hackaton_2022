package com.idealista.hackathon;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class WorldReader {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new File("").getAbsolutePath() + "/example.txt"));
            String line = reader.readLine();

            // Instrucciones iniciales
            String[] instrucciones1 = line.split(" ");
            int players = Integer.parseInt(instrucciones1[0]);
            int zombies = Integer.parseInt(instrucciones1[1]);
            int items = Integer.parseInt(instrucciones1[2]);
            int worldSize = Integer.parseInt(instrucciones1[3]);
            int commands = Integer.parseInt(instrucciones1[4]);

            // Supervivientes
            line = reader.readLine();
            while (line != null) {

                System.out.println(line);
                // read next line
                line = reader.readLine();

            }

            // Zombies

            // Items

            // Commands
            while (line != null) {



                System.out.println(line);
                // read next line
                line = reader.readLine();

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
