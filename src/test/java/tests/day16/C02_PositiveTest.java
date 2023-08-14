package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PositiveTest {

    // https://www.qualitydemy.com/
    // positive login test

    // visit qualitydemy.com
    // click login button
    // write the valid email
    // write valid password
    // click login button
    // test that you could login

    QualitydemyPage qualitydemyPage;

    @Test (groups = "smoke")
    public void positiveTest01(){

        qualitydemyPage = new QualitydemyPage();

        // visit qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // write the valid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty("qdValidMail"));

        // write valid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could login
        Assert.assertTrue(qualitydemyPage.homePageMyCoursesButton.isDisplayed());

        Driver.closeDriver();





    }

}
