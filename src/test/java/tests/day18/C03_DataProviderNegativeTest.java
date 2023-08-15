package tests.day18;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderNegativeTest {


    // visit Qualitydemy homePage
    // enter given username and passwords
    // test that you can not login

    // username     password
    // A11          A12345
    // B12          B12345
    // C13          C12345
    // D14          D12345
    // E15          E12345

    QualitydemyPage qualitydemyPage;

    @DataProvider
    public static Object[][] userInfo() {

        Object[][] userUserNameAndPasswordProvider = {{"A11","A12345"},{"B12","B12345"},{"C13","C12345"},
                {"D14","D12345"},{"E15","E12345"}};

        return userUserNameAndPasswordProvider;
    }



    @Test(dataProvider = "userInfo")
    public void negativeLoginTest(String userNames,String passwordsValues){

        qualitydemyPage= new QualitydemyPage();

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        qualitydemyPage.homePageLogInButton.click();

        qualitydemyPage.loginPageEmailTextBox.sendKeys(userNames);

        qualitydemyPage.loginPagePasswordTextBox.sendKeys(passwordsValues);

        qualitydemyPage.loginPageLoginButton.click();

        Assert.assertTrue(qualitydemyPage.loginPageEmailTextBox.isDisplayed());

        Driver.closeDriver();




    }
}
