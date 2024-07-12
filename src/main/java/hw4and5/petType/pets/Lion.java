package hw4and5.petType.pets;

import hw4and5.petType.Animals;

public class Lion extends Animals {
    public Lion(String name,int age,String gender) {
        super(name,age,gender);

    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " рычит.");

    }
}




