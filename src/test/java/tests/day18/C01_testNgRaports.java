package tests.day18;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_testNgRaports extends TestBaseRapor {

    AmazonPage amazonPage;

    @Test
    public void test01(){

        //1) extentTest object
        extentTest = extentReports.createTest("Nutella Test", "User should be able to search for Nutella");

        amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon webside is reached");

        amazonPage.homePageSearchTextBox.sendKeys("Nutella" + Keys.ENTER);
        extentTest.info("Searched for Nutella");
        // test that result text has nutella keyword

        String expectedKeyWord = "dNutella";
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();

        Assert.assertTrue(actualResultText.contains(expectedKeyWord));
        extentTest.pass("Tested that Result text has Nutella key word ");

        //Driver.closeDriver();

    }


}
