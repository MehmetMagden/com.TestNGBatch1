package tests.day14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class C05_SoftAssert {

    @Test (groups = {"smoke","miniReg2"})
    public void test01(){

        // 1)  we need to create an object from SoftAssert class
        // 2) by using the object we have created we need to test every step
        // 3) we should mention that all the assertions are completed

        // 1)  we need to create an object from SoftAssert class
        SoftAssert softAssert = new SoftAssert();

        // 2) by using the object we have created we need to test every step
        softAssert.assertEquals(6,6,"they are not equals");  // pass
            System.out.println("After first assertion");

        softAssert.assertTrue(8>3); // pass
            System.out.println("After second assertion");

        softAssert.assertTrue(8>3); // pass
            System.out.println("After third assertion");

        softAssert.assertTrue(8>5); // pass
            System.out.println("After 4. assertion");

        // 3) we should mention that all the assertions are completed
        softAssert.assertAll(); // if we do not write this code, system won't test anything.
                                // if we are using soft assertion we should not forget this line

            System.out.println("After assertAll method");

            /*
            if there is an error in the assertions, system will stop at assertAll method so it won't execute the rest

            if we are planning to use soft Asserton, we should add an error message in assertion. So we can understand
            where the problem is
             */

        Driver.closeDriver();

    }
}
