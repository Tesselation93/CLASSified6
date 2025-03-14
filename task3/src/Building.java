package task3;

import java.util.ArrayList;

// Setup the Building class with private variables - attributes that every building has
public class Building {
    private ArrayList<task3.Room> rooms;
    private int numberOfFloors;

    // Constructor - takes list of rooms and number of floors as input
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    // Getter - returns the list of rooms
    public ArrayList<task3.Room> getRooms() {
        return rooms;
    }

    // Setter - updates the list of rooms
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    // Getter - returns the number of floors
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Setter - updates the number of floors
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
