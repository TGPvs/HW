package hw4adn5;

public class Shark extends Fish {

    public Shark(String name,int age,String gender) {
        super(name,age,gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Не издает звуков.");

    }
}