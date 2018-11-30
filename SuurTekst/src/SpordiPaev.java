import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpordiPaev {
    public static void main(String[] args) {
        SortableList<Sportlased> athletes;

        try {
            File dataFile = new File("athletes.txt");
            FileInputStream fileInput = new FileInputStream(dataFile);
            ObjectInputStream reader = new ObjectInputStream(fileInput);
            athletes = (SortableList<Sportlased>) reader.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            athletes = new SortableList<Sportlased>();
            athletes.add(new Sportlased("Endrik Laanemägi", 5.6));
            athletes.add(new Sportlased("Henri Tamvere", 1.6));
            athletes.add(new Sportlased("Karl Juhkam", 7.6));
        }

//        Collections.sort(athletes);
        athletes.sort();

        for (Sportlased athlete : athletes) {
            System.out.println(athlete);
        }

        try {
            File dataFile = new File("athletes.txt");
            FileOutputStream fileOutput = new FileOutputStream(dataFile);
            ObjectOutputStream saver = new ObjectOutputStream(fileOutput);
            saver.writeObject(athletes);
            saver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}