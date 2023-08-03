package tests.day14;

import org.testng.annotations.Test;

public class C01_TestNgFirstTest {

    /*
    If we do not set any priority, they will be executed in alphabetical order.

    if we set any priority after @Test annotation, the lowest number will be executed first
    if we don't set any priority, the default value will be 0;
    we can use negative numbers too
     */

    @Test(priority = 100)
    public void firstTest(){
        System.out.println("First Test is executed");
    }

    @Test(priority = 20)
    public void secondTest(){
        System.out.println("Second Test is executed");
    }

    @Test (priority = 20)
    public void thirdTest(){
        System.out.println("Third Test is executed");
    }

}
