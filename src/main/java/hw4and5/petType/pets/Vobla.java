package hw4and5.petType.pets;

import hw4and5.petType.Fish;

public class Vobla extends Fish {

    public Vobla(String name,int age,String gender) {
        super(name,age,gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " не издает звуков.");

    }
}
