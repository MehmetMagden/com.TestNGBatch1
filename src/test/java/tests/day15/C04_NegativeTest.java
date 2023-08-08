package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_NegativeTest {

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

    @Test
    public void negativeTest01(){
        //*********** first test
        // visit qualitydemy.com
        // click login button
        // write the invalid email
        // write valid password
        // click login button
        // test that you could not login

        qualitydemyPage = new QualitydemyPage();

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage.homePageLogInButton.click();

        // write the invalid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys("asdfsad@fds.com");
        // write valid password
        qualitydemyPage.loginPagePasswordTextBox.sendKeys("Asd123123");

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void negativeTest02(){

        //*********** second test
        // visit qualitydemy.com
        // click login button
        // write the valid email
        // write invalid password
        // click login button
        // test that you could not login

        qualitydemyPage = new QualitydemyPage();

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage.homePageLogInButton.click();

        // write the valid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys("yasavoj150@prolug.com");
        // write valid inpassword
        qualitydemyPage.loginPagePasswordTextBox.sendKeys("Asd12sdfsdf3123");

        // click login button
        qualitydemyPage.loginPageLoginButton.click();

        // test that you could not login
        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void negativeTest03(){

        //*********** third test
        // visit qualitydemy.com
        // click login button
        // write the invalid email
        // write invalid password
        // click login button
        // test that you could not login

        qualitydemyPage = new QualitydemyPage();

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage.homePageLogInButton.click();

        // write the invalid email
        qualitydemyPage.loginPageEmailTextBox.sendKeys("yasasdfdasfavoj150@prolasdfug.com");
        // write valid inpassword
        qualitydemyPage.loginPagePasswordTextBox.sendKeys("Asdsdaf12sdasdfsaffsdf3123");

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

        Driver.getDriver().get("https://www.qualitydemy.com/");

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



