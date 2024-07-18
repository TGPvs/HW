package hw4and5.zooTest;


import hw4and5.petType.pets.*;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CreatureTest {

    @Test(groups = "positive")
    public void testLion() {
        Lion lion = new Lion("Симба", 2, "Мужская особь");
        Assert.assertEquals(lion.getName(), "Симба");
        Assert.assertEquals(lion.getAge(), 2);
        Assert.assertEquals(lion.getGender(), "Мужская особь");
        System.out.println("Лев является искомым");
    }

    @Test(groups = "positive")
    public void testElephant() {
        Elephant elephant = new Elephant("Дамбо", 2, "Мужская особь");
        Assert.assertEquals(elephant.getName(), "Дамбо");
        Assert.assertEquals(elephant.getAge(), 2);
        Assert.assertEquals(elephant.getGender(), "Мужская особь");
        System.out.println("Слон является искомым");
    }

}