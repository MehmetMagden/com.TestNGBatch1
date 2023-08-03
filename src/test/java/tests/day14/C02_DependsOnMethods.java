package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    // if we want to create chain reactions we can use depentsOnMethods option
    //

    @Test (dependsOnMethods = "secondTest")
    public void firstTest(){
        System.out.println("First Test executed");

    }

    @Test
    public void secondTest(){
        System.out.println("Second Test executed");
        //Assert.assertTrue(false); // if the first test fails, the rest will be ignored

    }

    @Test (dependsOnMethods = "firstTest")
    public void thirdTest(){
        System.out.println("Third Test executed");

    }
}
