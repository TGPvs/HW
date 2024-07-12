package hw4and5.petType.pets;

import hw4and5.petType.Animals;

public class Elephant extends Animals {

    public Elephant(String name,int age,String gender) {
        super(name,age,gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " трубит.");

    }
}