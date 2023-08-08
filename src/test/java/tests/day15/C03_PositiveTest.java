package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_PositiveTest {

    @Test
    public void test01(){

        // https://www.qualitydemy.com/
        // positive login test

        // visit qualitydemy.com
        // click login button
        // write the valid email
        // write valid password
        // click login button
        // test that you could login

        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        // visit qualitydemy.com
        Driver.getDriver().get("https://www.qualitydemy.com/");

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // write the valid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys("yasavoj150@prolug.com");

        // write valid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys("Asd123123");

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could login
        Assert.assertTrue(qualitydemyPage.homePageMyCoursesButton.isDisplayed());

        Driver.closeDriver();

    }
}
