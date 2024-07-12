package hw4and5.petType;

public abstract class Animals extends Creature {
    public Animals(String name, int age, String gender) {
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
