package tests.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_NutellaTest {

    @Test
    public void test01(){

        // go to amazon.com
        Driver.getDriver().get("https://www.amazon.com");

        // search for nutella

        WebElement amazonSearchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);


        // test that results have nutella word in it.
        WebElement amazonResultsWebElement = Driver.getDriver().findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));

        String expectedWord = "Nutella";
        String actualResultsText = amazonResultsWebElement.getText();

        Assert.assertTrue(actualResultsText.contains(expectedWord));

        Driver.closeDriver();



    }
}
