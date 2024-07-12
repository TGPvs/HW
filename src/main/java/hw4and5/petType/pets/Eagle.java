package hw4and5.petType.pets;

import hw4and5.petType.Bird;

public class Eagle extends Bird {

    public Eagle(String name,int age,String gender) {
        super(name, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Кричит.");

    }
}