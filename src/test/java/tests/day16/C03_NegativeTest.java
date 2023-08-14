package tests.day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_NegativeTest {


    // https://www.qualitydemy.com/
    // negative login test

    //*********** first test
    // visit qualitydemy.com
    // click login button
    // write the invalid email
    // write valid password
    // click login button
    // test that you could not login

    //*********** second test
    // visit qualitydemy.com
    // click login button
    // write the valid email
    // write invalid password
    // click login button
    // test that you could not login

    //*********** third test
    // visit qualitydemy.com
    // click login button
    // write the invalid email
    // write invalid password
    // click login button
    // test that you could not login

    //********** test 4
    // visit qualitydemy.com
    // click login button
    // with the empty email
    // with empty password
    // click login button
    // test that you could not login

    QualitydemyPage qualitydemyPage;



    @Test (groups = {"somke","miniReg1"})
    public void negativeTest01(){

        qualitydemyPage = new QualitydemyPage();



        //*********** first test
        // visit qualitydemy.com
        // click login button
        // write the invalid email
        // write valid password
        // click login button
        // test that you could not login

        // visit qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // write the invalid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty("qdInvalidMail"));

        // write valid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qdValidPassword"));

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();


    }

    @Test (groups = {"smoke","miniReg2"})
    public void negativeTest02(){


        //*********** second test
        // visit qualitydemy.com
        // click login button
        // write the valid email
        // write invalid password
        // click login button
        // test that you could not login

        qualitydemyPage = new QualitydemyPage();

        // visit qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // write the valid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty("qdValidMail"));

        // write invalid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }

    @Test (groups = "smoke")
    public void negativeTest03(){



        //*********** third test
        // visit qualitydemy.com
        // click login button
        // write the invalid email
        // write invalid password
        // click login button
        // test that you could not login

        qualitydemyPage = new QualitydemyPage();

        // visit qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // write the invalid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty("qdInvalidMail"));

        // write invalid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void negativeTest04(){
        //********** test 4
        // visit qualitydemy.com
        // click login button
        // with the empty email
        // with empty password
        // click login button
        // test that you could not login


        qualitydemyPage = new QualitydemyPage();

        // visit qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // click login button
        qualitydemyPage.homePageLogInButton.click();

        // with the empty email
        qualitydemyPage.loginPageEmailTextBox.sendKeys("");

        // with empty password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys("");

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();


    }

}
