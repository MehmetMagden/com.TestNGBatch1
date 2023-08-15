package tests.day18;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_DataProvider {

    AmazonPage amazonPage;

    @DataProvider
    public static Object[][] wordsToBeSearched() {

        Object[][] wordsToBeSearchedArray = {{"Java"},{"Samsung"},{"Apple"},{"Banana"},{"Acer"},{"Dell"}};

        return wordsToBeSearchedArray;
    }

    @Test(dataProvider = "wordsToBeSearched")
    public void searchTest(String wordsToSearch){

        amazonPage = new AmazonPage();

        // visit amazon.con
        Driver.getDriver().get("https://www.amazon.com");

        // searchs for desired word
        amazonPage.homePageSearchTextBox.sendKeys(wordsToSearch + Keys.ENTER);

        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        String expectedWord = wordsToSearch;

        // tests that result text has the expected word
        Assert.assertTrue(actualResultText.contains(expectedWord));

        Driver.closeDriver();

    }

}
