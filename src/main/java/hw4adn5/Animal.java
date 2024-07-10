package hw4adn5;

public abstract class Animal extends Creature {
    public Animal(String name, int age,String gender) {
        super(name,age,gender);
    }
    @Override
    public void move() {
        System.out.println(getName() + " передвигается с помощью лап.");
    }
    @Override
    public void breath(){
        System.out.println(getName()+ " дышит легкими");

    }


}
