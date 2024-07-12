package hw4and5.petType;

public abstract class Bird extends Creature {
    public Bird(String name,int age,String gender) {
        super(name,age,gender);
    }
    @Override
    public void move() {
        System.out.println(getName() + " летает с помощью крыльев.");
    }
    @Override
    public void breath(){
        System.out.println(getName()+ " дышит легкими.");

    }


}
