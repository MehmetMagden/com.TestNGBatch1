package tests.day16;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_ScreenShot {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        ReusableMethods.getScreenshot("FirstSS");

    }

}
