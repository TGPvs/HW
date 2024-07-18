package hw8.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test3 extends BaseTest{
    int a = 0;
    int b = 0;

    @BeforeClass
    public void beforeClass() {
        System.out.println( "Before Class Test3" );
    }

    @BeforeMethod
    // эти действия будут выполнены перед выполнением теста ( другими словами прекондишен) в нашем случае проиойдет инициализация а и б.
    public void beforeMethod() {
        System.out.println( "Подготовка тестовых данных Test3" );
        a = 2;
        b = 5;
    }

    @Test(description = "Test")
    public void testOne() {
        System.out.println( "Сумма равна 7(тест1) Test3" );
        Assert.assertEquals( a + b, 7 );
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println( "Очистка тестовых данных Test3" );
        a = 0;
        b = 0;
    }

    @Test(description = "Test3", groups = "Smoke")
    public void testTwo() {
        System.out.println( "(test3groups)" );
    }
}
