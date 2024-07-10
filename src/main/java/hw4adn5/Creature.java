package hw4adn5;

public abstract class Creature implements IBreath, IMove, ISound {
    public String name;
    public int age;
    public String gender;


    public Creature(String name, int age,String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
   public String getName() {
        return name;
   }
   public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}
