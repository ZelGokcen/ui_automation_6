package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class _14_MultipleWindowsTest extends Base{

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend");
        driver.findElement(By.id("card-10")).click();
    }

    /*
    TEST CASE
    Go to https://techglobal-training.com/frontend
    Click on "Multiple Windows" card
    Click on "Apple"
    Validate the Apple logo is displayed
     */

    @Test
    public void validateTheAppleNavigation(){
        WebElement appleLink = driver.findElement(By.id("apple"));

        appleLink.click();
    }
}
