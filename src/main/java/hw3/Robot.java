package hw3;


public class Robot {

    public String model;
    public String name;
    Battery battery;
    Tech tech;

    public Robot(String model, String name, Battery battery, Tech tech) {
        this.model = model;
        this.name = name;
        this.battery = battery;
    }

    public void gameInfo() {
        System.out.println("You can play with robot! Use 'right', 'left', 'forward', 'backward' to move, 'charge' to charge it and 'stop' to turn this robot off.");
    }

    public void moveLeft() {
        System.out.println("Robot is moving left");
        if (this.battery.decreaseCharge()){
        }
    }

    public void moveRight() {
        System.out.println("Robot is moving right");
        if (this.battery.decreaseCharge()){
        }
    }

    public void moveForward() {
        System.out.println("Robot is moving forward");
        if (this.battery.decreaseCharge()){
        }
    }

    public void moveBackward() {
        System.out.println("Robot is moving back");
        if (this.battery.decreaseCharge()){
        }
    }
    public void charge() {
        this.battery.charge();
        System.out.println("Robot is charged up to 100");
    }
}
