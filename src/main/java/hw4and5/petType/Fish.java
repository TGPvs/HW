package hw4and5.petType;

public abstract class Fish extends Creature {
    public Fish(String name, int age,String gender) {
        super(name,age,gender);
    }
    @Override
    public void move() {
        System.out.println(getName() + " передвигается с пормощью плавников.");
    }
    @Override
    public void breath(){
        System.out.println(getName()+ " дышит жабрами.");

    }


}
