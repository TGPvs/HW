package hw3;


public class Battery {

    final double MAX_CAPACITY;
    private double capacity;


    public Battery(double capacity) {

        this.MAX_CAPACITY = capacity;
        this.capacity = this.MAX_CAPACITY;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public void charge() {
        if (this.capacity == this.MAX_CAPACITY) {
            System.out.println("Battery is already full!");
        } else {
            this.capacity = this.MAX_CAPACITY;
            System.out.println("Battery is charged! You can play!");
        }
    }
    public boolean decreaseCharge() {
        if (this.capacity >= 30) {
            this.capacity -= 30;
            System.out.println("Remain Capacity: " + this.capacity);
            return true;
        } else {
            System.out.println("Now battery is low! Please Charge!");
            return false;
        }
    }
}

