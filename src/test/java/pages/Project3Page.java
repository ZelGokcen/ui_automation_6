package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project3Page {

    public Project3Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[value='One way']")
    public WebElement one_wayRadioButton;

    @FindBy(css = "input[value='Round trip']")
    public WebElement roundTripRadioButton;

    @FindBy(xpath = "(//div[@class='field']/label)[1]")
    public WebElement cabinClassLabel;
    @FindBy(xpath = "(//div[@style='width: 100%;']/select)[1]")
    public WebElement cabinClassDropdown;

    @FindBy(xpath = "(//div[@class='field']/label)[2]")
    public WebElement fromLabel;
    @FindBy(css = "form>div>div:nth-child(3)>div")
    public WebElement fromDropdown;

    @FindBy(xpath = "(//div[@class='field']/label)[3]")
    public WebElement toLabel;
    @FindBy(css = "form>div>div:nth-child(4)>div")
    public WebElement toDropdown;

    @FindBy(xpath = "(//div[@class='field']/label)[4]")
    public WebElement departLabel;
    @FindBy(css = ".react-date-picker")
    public WebElement datePickerDepart;

    @FindBy(xpath = "(//div[@class='field']/label)[5]")
    public WebElement returnLabel;

    @FindBy(css = ".react-date-picker__inputGroup")
    public WebElement datePickerReturn;

    @FindBy(xpath = "(//div[@class='field']/label)[6]")
    public WebElement numberOfPassengersLabel;

    @FindBy(css = "form>div>div:nth-child(7)>div")
    public WebElement numPassengerBox;

    @FindBy(xpath = "(//div[@class='field']/label)[7]")
    public WebElement passenger1Label;

    @FindBy(css = "form>div>div:nth-child(8)>div>select")
    public WebElement passenger1_AgeDropdown;


    @FindBy(css = "button[class^='Button']")
    public WebElement bookButton;



    /*@FindBy(css = "div[class='control Projects_book__5x-Pg']")
    public WebElement bookButton; >>> benim buldugum.

     */

    //@FindBy(xpath = "(//div[@style='width: 100%;']/select)[1]")
    //public WebElement cabinClassDropdown;

    //(//div[@style='width: 100%;']/select)[1]/option [2] Premium Economy
        //    (//div[@style='width: 100%;']/select)[1]/option [3] Business
       //     (//div[@style='width: 100%;']/select)[1]/option [4]  First (edited)
    @FindBy(xpath = "(//div[@style='width: 100%;']/select)[1]/option [2]")
    public WebElement select_Business;







}
