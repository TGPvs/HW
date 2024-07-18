package hw8.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class test1 extends BaseTest {
    @Test
    public void test1Test() throws IOException {
        System.out.println("@Test.test1Test");

    }
    @Test
    public void test1Test1(){
        int a = 2;
        int b = 3;
        int result = a + b;

        Assert.assertEquals(result,5,"Проверка на дурака");
        System.out.println("Assert.test1Test");
    }
}
