package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class GoogleSearchResultsPage {

    public GoogleSearchResultsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "result-stats")
    public WebElement resultTag;
}
