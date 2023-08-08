package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {

    public ZeroPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (id = "signin_button")
    public WebElement homePageSighInButton;

    @FindBy (id = "user_login")
    public WebElement sighInPageEmailTextBox;

    @FindBy(id = "user_password")
    public WebElement sigInPagePasswordTextBox;

    @FindBy(name = "submit")
    public WebElement sigInPageSubmitButton;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingLink;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsButton;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyButton;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDown;


}
