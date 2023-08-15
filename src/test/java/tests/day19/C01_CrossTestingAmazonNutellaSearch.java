package tests.day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C01_CrossTestingAmazonNutellaSearch extends TestBaseCross {

    @Test
    public void test01(){


        // visit amazon.com
        driver.get(ConfigReader.getProperty("amazonUrl"));

        // search for "Nutella"
        WebElement amazonSearchBoxWebElement = driver.findElement(By.id("twotabsearchtextbox")) ;
        amazonSearchBoxWebElement.sendKeys("Nutella" + Keys.ENTER);

        // test that result text has "Nutella" word in it
        String expectedKeyWord = "Nutella";

        WebElement amazonResultTextWebElement = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));
        String actualResultText = amazonResultTextWebElement.getText();

        Assert.assertTrue(actualResultText.contains(expectedKeyWord));

        ReusableMethods.waitfor(3);



    }




}
