package tests.day15;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_SoftAssertionQuestion {

    @Test
    public void test(){

        //Create a New Class: C03_SoftAssert
        //1. Go to “http://zero.webappsecurity.com/”
        //2. Press the Sign in button
        //3. Type “username” in the login box
        //4. Type “password” in the Password box
        //5. Press the Sign in button
        //6. Go to the Pay Bills page in the online banking menu
        //7. Press the “Purchase Foreign Currency” key
        //8. Select Eurozone from the “Currency” drop down menu
        //9. Test that "Eurozone (euro)" is selected using soft assert
        //10. Test that the DropDown list has these options using soft assert "Select One",
        // "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone) ",
        // "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)",
        // "Norway (krone)","New Zealand ( dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        ZeroPage zeroPage = new ZeroPage();

        //1. Go to “http://zero.webappsecurity.com/”
        Driver.getDriver().get("http://zero.webappsecurity.com/");

        //2. Press the Sign in button
        zeroPage.homePageSighInButton.click();

        //3. Type “username” in the login box
        zeroPage.sighInPageEmailTextBox.sendKeys("username");

        //4. Type “password” in the Password box
        zeroPage.sigInPagePasswordTextBox.sendKeys("password");

        //5. Press the Sign in button
        zeroPage.sigInPageSubmitButton.click();

        //6. Go to the Pay Bills page in the online banking menu
        Driver.getDriver().navigate().back();  // there was a bug there so we navigated back
        zeroPage.onlineBankingLink.click();
        zeroPage.payBillsButton.click();

        //7. Press the “Purchase Foreign Currency” key
        zeroPage.purchaseForeignCurrencyButton.click();

        //8. Select Eurozone from the “Currency” drop down menu


        Select select = new Select(zeroPage.currencyDropDown);
        select.selectByVisibleText("Eurozone (euro)");

        //9. Test that "Eurozone (euro)" is selected using soft assert

        String actualSelectedOption = select.getFirstSelectedOption().getText();
        String expectedSelectedOption = "Eurozone (euro)";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualSelectedOption,expectedSelectedOption,"Eurozone is not selected");

        //10. Test that the DropDown list has these options using soft assert "Select One",
        // "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone) ",
        // "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)",
        // "Norway (krone)","New Zealand ( dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"




         List<WebElement> selectedOptionsWebELementsList =  select.getOptions();
         List<String> actualSelectedOptionsTextList  = new ArrayList<>();

        for (WebElement eachWebelement: selectedOptionsWebELementsList
             ) {
            actualSelectedOptionsTextList.add(eachWebelement.getText());
        }

        String[] arr = {"Select One",
                 "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)",
                 "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)",
                 "Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"} ;

        List<String> expectedOptionsTextList = Arrays.asList(arr);

        softAssert.assertEquals(actualSelectedOptionsTextList,expectedOptionsTextList,"options lists are not same");




        softAssert.assertAll();




    }
}
