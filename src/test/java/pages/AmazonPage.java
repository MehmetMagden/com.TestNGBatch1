package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    /*
    In testNG framework to save time, we locate webelements once. We locate them in page classes
    If we are planing to create a method for only this page, we can create that method in the same page class
     */

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy (id ="twotabsearchtextbox")
    public WebElement homePageSearchTextBox;

    @FindBy (xpath = "//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']")
    public WebElement amazonResultsTextWebElement;

}
