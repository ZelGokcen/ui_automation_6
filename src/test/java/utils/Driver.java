package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    private Driver(){} // constructor

    public static WebDriver getDriver(){ // method that set up the driver and returns
        if(driver == null){ // this is when we do this >> if driver is null
            WebDriverManager.chromedriver().setup(); // Set up Chrome driver

            driver = new ChromeDriver(); // Launch a Chrome driver
            driver.manage().window().maximize(); // Maximizes the Chrome window
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
        }
        return driver;
    }


    public static void quitDriver(){
        if(driver != null){ // if not null, return existing object and quit the driver.
            driver.manage().deleteAllCookies(); // to not get issues for next execution.
            driver.quit();
            driver = null; // make sure driver is null(nothing)
        }
    }
}
