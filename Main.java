/*
Reflection Questions:

1. Why should the fields be private?
   Fields should be private to protect data from being changed directly.
   Getters and setters provide controlled access and allow validation.

2. What happens if the Car constructor does not call super(...)?
   Java tries to call the parent's no-argument constructor automatically.
   Vehicle only has a constructor with parameters, so the program will not
   compile unless Car calls super(brand, year).

3. What is the difference between this.type and super.type?
   this.type refers to the type variable in Car.
   super.type refers to the type variable in Vehicle.
*/

public class Main {

    public static void main(String[] args) {

        // Create a regular car
        Car car = new Car("Toyota", 2022, 4);

        System.out.println("REGULAR CAR");
        car.describe();
        car.accelerate(20);
        System.out.println("Speed: " + car.getSpeed());
        car.showTypes();

        System.out.println();

        // Create an electric car
        ElectricCar electricCar = new ElectricCar("Tesla", 2024, 4, 100);

        System.out.println("ELECTRIC CAR");
        electricCar.describe();
        electricCar.accelerate(30);
        System.out.println("Speed: " + electricCar.getSpeed());
        System.out.println(
            "Battery after acceleration: "
            + electricCar.getBatteryLevel() + "%"
        );
        electricCar.showTypes();

        System.out.println();

        // Test invalid values
        System.out.println("TEST INVALID VALUES");
        car.setSpeed(-10);
        car.setDoors(3);

        // Fields cannot be accessed directly because they are private.
        // car.speed = 50; // This would cause a compile error.
        // Use car.setSpeed(50) instead.
    }
}
