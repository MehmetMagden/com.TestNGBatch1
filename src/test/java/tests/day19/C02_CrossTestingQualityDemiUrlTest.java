package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C02_CrossTestingQualityDemiUrlTest extends TestBaseCross {

    @Test
    public void test01(){


        // visit quality demy
        driver.get(ConfigReader.getProperty("qdUrl"));

        // test that url has "quality"

        String expectedWord = "quality";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedWord));

        ReusableMethods.waitfor(3);




    }

}
