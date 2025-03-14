package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Setup the Cafe class with a private ArrayList for coffee menu
public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    // Getter - returns the list of coffees
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // Method to load coffee names from the text file into the ArrayList
    public void loadMenuData() {
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}
