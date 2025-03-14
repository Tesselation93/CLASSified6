package task3;

import java.util.ArrayList;

// Main class - this is where the program starts
public class Main {
    public static void main(String[] args) {
        // Create rooms
        Room room1 = new Room(2, 1);
        Room room2 = new Room(3, 2);
        Room room3 = new Room(1, 1);

        // Add rooms to a list
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // Create a building with rooms and set number of floors
        Building building = new Building(rooms, 2);

        // Print total lamps and windows in the building
        System.out.println("Total lamps: " + countLampsInBuilding(building));
        System.out.println("Total windows: " + countWindowsInBuilding(building));
        System.out.println("Is the building normal? " + isNormal(building));
    }

    // Method to count total number of lamps in a building
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    // Method to count total number of windows in a building
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    // Method to check if the building is normal
    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}
