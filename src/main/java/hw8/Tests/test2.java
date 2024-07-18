package hw8.Tests;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class test2 extends BaseTest{
    @BeforeClass
    public void beforeTestClass() {
        System.out.println("Before Class(test2Test)");
    }
    @BeforeGroups
    public void beforeTestGroups() {
        System.out.println("Before Groups(test2Test)");
    }
    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("Before Method(test2Test)");
    }
    @BeforeTest
    public void beforeTestTest() {
        System.out.println("Before Test(test2Test)");
    }
    @BeforeSuite
    public void beforeTestSuite() {
        System.out.println("Before Suite(test2Test)");
    }
    @Test
    public void testTwo (){
        System.out.println("testTest2");
    }
}
