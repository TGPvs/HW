package hw4and5;

public class Elephant extends Animal {

    public Elephant(String name,int age,String gender) {
        super(name,age,gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Трубит.");

    }
}