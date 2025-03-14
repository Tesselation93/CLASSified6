package task2;

// Import necessary classes
import java.util.ArrayList;

// Main class - this is where the program starts
public class Main {
    public static void main(String[] args) {
        // Create an instance of Cafe
        Cafe cafe = new Cafe();

        // Load coffee names from file
        cafe.loadMenuData();

        // Print all coffees in the menu
        printCoffeeMenu(cafe.getCoffeeMenu());
    }

    // Method to print all coffee names in the list
    public static void printCoffeeMenu(ArrayList<String> coffeeMenu) {
        for (String coffee : coffeeMenu) {
            System.out.println(coffee);
        }
    }
}
