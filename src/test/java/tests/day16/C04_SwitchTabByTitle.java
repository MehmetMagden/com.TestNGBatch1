package tests.day16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_SwitchTabByTitle {

   // visit  https://the-internet.herokuapp.com/iframe
    // click  elemental selenium link
    // switch to the tab that has "Elemental Selenium | Elemental Selenium" title
    // test that you are in new tab

    @Test
    public void test01(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");

        Driver.getDriver().findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

        ReusableMethods.switchToWindow("Elemental Selenium | Elemental Selenium");

        String expectedText = "Make sure your code lands";
        String actualText =  Driver.getDriver().findElement(By.xpath("//h1[@data-drip-attribute='headline']")).getText();

        Assert.assertEquals(actualText,expectedText);


        ReusableMethods.waitFor(5);
        Driver.quitDriver();

    }


}
