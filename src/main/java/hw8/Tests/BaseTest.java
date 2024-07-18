package hw8.Tests;

import org.testng.annotations.*;


public class BaseTest {

    @BeforeClass
    public void beforeTestClass() {
        System.out.println("Before Class(baseTest)");
    }
    @BeforeGroups
    public void beforeTestGroups() {
        System.out.println("Before Groups(baseTest)");
    }
    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("Before Method(baseTest)");
    }
    @BeforeTest
    public void beforeTestTest() {
        System.out.println("Before Test(baseTest)");
    }
    @BeforeSuite
    public void beforeTestSuite() {
        System.out.println("Before Suite(baseTest)");
    }
    @AfterClass
    public void afterTestClass() {
        System.out.println("After Class(test2Test)");
    }
}
