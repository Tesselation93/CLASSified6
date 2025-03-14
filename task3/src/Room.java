package task3;

// Setup the Room class with private variables - attributes that every room has
public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    // Constructor - takes number of lamps and windows as input
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // Getter - returns the number of lamps
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    // Setter - updates the number of lamps
    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    // Getter - returns the number of windows
    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    // Setter - updates the number of windows
    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
