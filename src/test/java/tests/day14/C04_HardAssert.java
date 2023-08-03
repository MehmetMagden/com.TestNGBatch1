package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {

    /*
    in TestNG, we have to different kind of test,
    1) HardAssertion : whenever the system finds a bug, it will stop executing code and it will tell us where the problem is
    until now we have used HardAssertions

    2) Soft Assertion : The system will continue executing the code until the end. Even it finds a bug, it won't stop executing


     */

    @Test
    public void test01(){

        Assert.assertTrue(6>5);
            System.out.println("after the first assertion");

        Assert.assertTrue(7>5);
            System.out.println("after the second assertion");

        Assert.assertTrue(2>5);
            System.out.println("after the third assertion");


    }



}
