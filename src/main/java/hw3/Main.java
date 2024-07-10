package hw3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String line = new String();
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        boolean robotIsActive = false;

        Robot robot = new Robot("Walker01", "Sam", new Battery(100), new Tech(64, "Intel", "cortana"));

        System.out.println("\nYour robot is:");
        System.out.println("Model: " + robot.model);
        System.out.println("Name: " + robot.name);
        System.out.println("Battery Capacity: " + robot.battery.getCapacity());
        System.out.println("\nType 'start' to turn the robot on!");


        while (game) {

            line = sc.nextLine();

            switch (line) {
                case "start":
                    if (!robotIsActive) {
                        robotIsActive = true;
                        robot.gameInfo();
                    } else {
                        System.out.println("Your robot already active!");
                    }
                    break;
                case "right":
                    if (robotIsActive) {
                        robot.moveRight();
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                case "left":
                    if (robotIsActive) {
                        robot.moveLeft();
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                case "forward":
                    if (robotIsActive) {
                        robot.moveForward();
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                case "backward":
                    if (robotIsActive) {
                        robot.moveBackward();
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                case "charge":
                    if (robotIsActive) {
                        robot.charge();
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                case "stop":
                    if (robotIsActive) {
                        game = false;
                        sc.close();
                        System.out.println("Robot is shutting down");
                    } else {
                        System.out.println("Robot is not active! Please type 'start'!");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

