package tests.day16;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_ConfigReader {

    /*
    We created configurations.properties file to store all data variables. So if we need to change one of them, we do not
    need to change them from classes. Instead we should change it from the file.

    So maintenance, update will be much faster and easier.
    This way we create a dynamic project

    to read data values from configuration file, we use ConfigReader Class
     */

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        ReusableMethods.waitfor(3);
        Driver.closeDriver();




    }

}
