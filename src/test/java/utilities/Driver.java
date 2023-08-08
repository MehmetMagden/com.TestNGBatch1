package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    /*
    we use, call the driver by using a static method so we do not need to create any object from Driver class
    to prevent creating objects from this class we need to make the constructor private.

    If we make it private it means we are using Singleten Patern


     */


    private Driver (){ // SINGLETON PATERN

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){


        String browser = ConfigReader.getProperty("browser");

        if (driver==null){

            switch (browser){

                case  "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "mozilla":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
        }


        return driver;
    }

    public static void closeDriver(){

        if (driver!=null){
            driver.close();
            driver=null;
        }

    }


    public static void quitDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }

    }

}
