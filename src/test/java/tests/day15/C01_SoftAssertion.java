package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;

public class C01_SoftAssertion {

    @Test(groups = "miniReg1")
    public void test91(){

        // go to the amazon.com
        // verify the url

        //Search for "nutella"
        // verify that results text has the key "nutella"

        // search for "Java"
        // verify that number of results is higher than 50

        // go to the amazon.com
        Driver.getDriver().get("https://www.amazon.com");

        // verify the url
        SoftAssert softAssert = new SoftAssert();

        String expectedUrlWord = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actualUrl.contains(expectedUrlWord),"Actual URL does not contain expected word");


        //Search for "nutella"
        AmazonPage amazonPage = new AmazonPage(); // by using this object, I can reach all the locaters located under this class
        amazonPage.homePageSearchTextBox.sendKeys("nutella"+ Keys.ENTER);

        // verify that results text has the key "nutella"
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        String expectedResultWord = "nutella";

        softAssert.assertTrue(actualResultText.contains(expectedResultWord),"searchText does not contain the word");

        // search for "Java"
        amazonPage.homePageSearchTextBox.clear();
        amazonPage.homePageSearchTextBox.sendKeys("Java"+Keys.ENTER);
        // verify that number of results is higher than 50

        // we will get the results web element text value // 1-48 of over 4,000 results for "Java"
        // I need to reach the number, how can i reach it?

        String resultText = amazonPage.amazonResultsTextWebElement.getText(); // 1-16 of over 60,000 results for "Java"
        System.out.println(resultText);

        String[] arr = resultText.split(" ");
        System.out.println(Arrays.toString(arr));

        String strResultNumber = arr[3]; // 5,000

        strResultNumber = strResultNumber.replaceAll("\\D","");
        System.out.println(strResultNumber); // 5000
        int resultNumber = Integer.parseInt(strResultNumber);

        softAssert.assertTrue(resultNumber>100,"number of results is not higher");



        softAssert.assertAll(); // we need to add assertAll to test soft assertion

        ReusableMethods.waitfor(1);
        Driver.closeDriver();


    }
}
