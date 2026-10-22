public class Vehicle {

    // Reflection 1: Fields should be private to protect the data.
    // Getters and setters provide controlled access to the fields.

    private String brand;
    private int year;
    private int speed;

    // Package-visible variable (not private)
    String type = "Vehicle";

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.speed = 0;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    // Setter that rejects negative speed
    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Invalid speed rejected.");
        } else {
            this.speed = speed;
        }
    }

    // Describe the vehicle
    public void describe() {
        System.out.println("Vehicle: " + brand + " (" + year + ")");
    }

    // Increase speed
    public void accelerate(int amount) {
        if (amount > 0) {
            speed = speed + amount;
        }
    }
}
