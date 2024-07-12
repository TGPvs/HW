package hw4and5.petType;

import hw4and5.actions.IBreath;
import hw4and5.actions.IMove;
import hw4and5.actions.ISound;

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
