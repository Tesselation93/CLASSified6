package task1;

import java.util.ArrayList;

// Main class - this is where the program starts
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store multiple customers
        ArrayList<Customer> customers = new ArrayList<>();

        // Add new customer objects to the list
        customers.add(new Customer("Camilla", "Young Andersen", "YoungCami"));
        customers.add(new Customer("Olivia", "Larsen", "OliLolli"));
        customers.add(new Customer("Tess", "van Slyck", "Tesselation"));

        // Call method to print all customers
        printCustomers(customers);
    }

    // Method to loop through and print all customers
    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}