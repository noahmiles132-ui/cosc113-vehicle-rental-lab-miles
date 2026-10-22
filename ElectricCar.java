public class ElectricCar extends Car {

    private int batteryLevel;

    public ElectricCar(String brand, int year, int doors, int batteryLevel) {
        super(brand, year, doors);

        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            this.batteryLevel = 100;
            System.out.println("Invalid battery level. Set to 100.");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level rejected.");
        }
    }

    @Override
    public void accelerate(int amount) {
        super.accelerate(amount);

        // Reduce battery by 1 after a positive acceleration
        if (amount > 0 && batteryLevel > 0) {
            batteryLevel = batteryLevel - 1;
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
