package hw4adn5;

public class Lion extends Animal {
    public Lion(String name,int age,String gender) {
        super(name,age,gender);

    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Рычит.");

    }
}




