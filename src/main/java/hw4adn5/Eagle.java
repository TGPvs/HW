package hw4adn5;

public class Eagle extends Bird {

    public Eagle(String name,int age,String gender) {
        super(name, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Кричит.");

    }
}