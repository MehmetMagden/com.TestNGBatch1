package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }


    @FindBy (xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement homePageLogInButton;

    @FindBy (name = "email")
    public WebElement loginPageEmailTextBox;

    @FindBy (name = "password")
    public WebElement loginPagePasswordTextBox;

    @FindBy (xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginPageLoginButton;

    @FindBy (xpath = "(//a[text()='My courses'])[1]")
    public WebElement homePageMyCoursesButton;


}
