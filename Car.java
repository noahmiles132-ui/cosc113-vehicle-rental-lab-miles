public class Car extends Vehicle {

    private int doors;

    // This variable hides Vehicle's type variable
    String type = "Car";

    // Constructor must call the parent constructor
    public Car(String brand, int year, int doors) {
        super(brand, year);
        setDoors(doors);
    }

    // Override the parent's describe method
    @Override
    public void describe() {
        super.describe();
        System.out.println("Doors: " + doors);
    }

    // Display this class's type and the parent's type
    public void showTypes() {
        System.out.println(
            "Type: " + this.type +
            " | Parent type: " + super.type
        );
    }

    public int getDoors() {
        return doors;
    }

    // Only 2 or 4 doors are allowed
    public void setDoors(int doors) {
        if (doors == 2 || doors == 4) {
            this.doors = doors;
        } else {
            System.out.println("Invalid doors rejected.");
        }
    }
}
