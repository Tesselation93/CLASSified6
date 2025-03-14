package task1;

// Setup Customer class with private variables - attributes that every customer has
public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;

    // Constructor - takes first name, last name, and username as input
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter;
        counter++;
    }

    // Getter - returns the first name
    public String getFirstName() {
        return firstName;
    }

    // Setter - updates the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter - returns the last name
    public String getLastName() {
        return lastName;
    }

    // Setter - updates the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter - returns the username
    public String getUsername() {
        return username;
    }

    // Setter - updates the username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter - returns the unique customer ID
    public int getId() {
        return id;
    }

    // toString method - creates a nicely formatted string with customer details
    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + firstName + " " + lastName + ", Username: " + username;
    }
}
