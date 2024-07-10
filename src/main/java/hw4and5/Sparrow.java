package hw4and5;

public class Sparrow extends Bird {

    public Sparrow(String name,int age,String gender) {
        super(name,age,gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Чирикает.");

    }
}