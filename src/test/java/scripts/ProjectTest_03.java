package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Project3Page;
import utils.DropdownHandler;

import java.util.List;


public class ProjectTest_03 extends Base{

    @BeforeMethod
    public void setPage() {
        driver.get("https://techglobal-training.com/frontend/project-3");
       //  actions = new Actions(driver);
        project3Page = new Project3Page();

    }
    /**  "Test Case 01"
     * Navigate to https://techglobal-training.com/frontend/project-3
     * Validate that the “One way” radio button is displayed enabled and selected by default
     * Validate that the “Round trip” radio button is displayed enabled and not selected by default
     * Validate that the “Cabin Class” label and dropdown are displayed //>> //div[@class="field"]/label
     * Validate that the “From” label and dropdown are displayed
     * Validate that the “To” label and dropdown are displayed
     * Validate that the “Depart” label and date picker is displayed
     * Validate that the “Return” label and date picker is displayed and disabled
     * Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
     * Validate that the “Passenger 1” category label and dropdown are displayed and “Adult (16-64)” is the default
     * Validate that the “BOOK” button is displayed and enabled
     */

    @Test (priority = 1, description = "Test Case 01 - Validate Booking Info Buttons And Labels")
    public void validateBookingInfoButtonsAndLabels(){

        //* Validate that the “One way” radio button is displayed enabled and selected by default
        Assert.assertTrue(project3Page.one_wayRadioButton.isDisplayed());
        Assert.assertTrue(project3Page.one_wayRadioButton.isEnabled());
        Assert.assertTrue(project3Page.one_wayRadioButton.isSelected());

        //* Validate that the "Round trip" radio button is displayed enabled and not selected by default
        Assert.assertTrue(project3Page.roundTripRadioButton.isDisplayed());
        Assert.assertTrue(project3Page.roundTripRadioButton.isEnabled());
        Assert.assertFalse(project3Page.roundTripRadioButton.isSelected());

        //* Validate that the “Cabin Class” label and dropdown are displayed
        Assert.assertTrue(project3Page.cabinClassLabel.isDisplayed());
        Assert.assertTrue(project3Page.cabinClassDropdown.isDisplayed());

        //* Validate that the “From” label and dropdown are displayed
        Assert.assertTrue(project3Page.fromLabel.isDisplayed());
        Assert.assertTrue(project3Page.fromDropdown.isDisplayed());

        //* Validate that the “To” label and dropdown are displayed
        Assert.assertTrue(project3Page.toLabel.isDisplayed());
        Assert.assertTrue(project3Page.toDropdown.isDisplayed());

        //* Validate that the “Depart” label and date picker is displayed
        Assert.assertTrue(project3Page.departLabel.isDisplayed());
        Assert.assertTrue(project3Page.datePickerDepart.isDisplayed());

        //* Validate that the “Return” label and date picker is displayed and disabled
        Assert.assertTrue(project3Page.returnLabel.isDisplayed());
        Assert.assertTrue(project3Page.datePickerReturn.isDisplayed());

        //* Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
        Assert.assertTrue(project3Page.numberOfPassengersLabel.isDisplayed());
        Assert.assertTrue(project3Page.numPassengerBox.isDisplayed());
        Assert.assertEquals(project3Page.numberOfPassengersLabel.getText(), "Number of passengers");
        Assert.assertEquals(project3Page.numPassengerBox.getAttribute("value"), "1");


        //* Validate that the “Passenger 1” category label and dropdown are displayed and “Adult (16-64)” is the default
        Assert.assertTrue(project3Page.passenger1Label.isDisplayed());
        Assert.assertTrue(project3Page.passenger1_AgeDropdown.isDisplayed());
        Assert.assertEquals(project3Page.passenger1Label.getText(), "Passenger 1");
        Assert.assertEquals(project3Page.passenger1_AgeDropdown.getAttribute("value"), "Adult (16-64)");


        //* Validate that the “BOOK” button is displayed and enabled
        Assert.assertTrue(project3Page.bookButton.isDisplayed());
        Assert.assertTrue(project3Page.bookButton.isEnabled());
        Assert.assertEquals(project3Page.bookButton.getText(), "BOOK");

    }

    /**  "Test Case 02"
     * Click on the “Round trip” radio button and validate it is selected
     * Validate that the “One way” radio button is not selected
     * Validate that the “Cabin Class” label and dropdown are displayed
     * Validate that the “From” label and dropdown are displayed
     * Validate that the “To” label and dropdown are displayed
     * Validate that the “Depart” label and date picker is displayed
     * Validate that the “Return” label and date picker is displayed
     * Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
     * Validate that the “Passenger 1” label and dropdown are displayed and “Adult (16-64)” is the default
     * Validate that the “BOOK” button is displayed and enabled
     */

    @Test (priority = 2, description = "Test Case 02")
    public void validateRoundTripRadioButton(){

        // 1 - Click on the “Round trip” radio button and validate it is selected
        project3Page.roundTripRadioButton.click();
        Assert.assertTrue(project3Page.roundTripRadioButton.isSelected());

        // 2 - Validate that the “One way” radio button is not selected
        Assert.assertFalse(project3Page.one_wayRadioButton.isSelected());

        // 3 - Validate that the “Cabin Class” label and dropdown are displayed
        Assert.assertTrue(project3Page.cabinClassLabel.isDisplayed());
        Assert.assertTrue(project3Page.cabinClassDropdown.isDisplayed());

        // 4 - Validate that the “From” label and dropdown are displayed
        Assert.assertTrue(project3Page.fromLabel.isDisplayed());
        Assert.assertTrue(project3Page.fromDropdown.isDisplayed());

        // 5 - Validate that the “To” label and dropdown are displayed
        Assert.assertTrue(project3Page.toLabel.isDisplayed());
        Assert.assertTrue(project3Page.toDropdown.isDisplayed());

        // 6 - Validate that the “Depart” label and date picker is displayed
        Assert.assertTrue(project3Page.departLabel.isDisplayed());
        Assert.assertTrue(project3Page.datePickerDepart.isDisplayed());

        // 7 - Validate that the “Return” label and date picker is displayed and disabled
        Assert.assertTrue(project3Page.returnLabel.isDisplayed());
        Assert.assertTrue(project3Page.datePickerReturn.isDisplayed());

        // 8 - Validate that the “Number of passengers” label and dropdown are displayed and 1 is the default
        Assert.assertTrue(project3Page.numberOfPassengersLabel.isDisplayed());
        Assert.assertTrue(project3Page.numPassengerBox.isDisplayed());
        Assert.assertEquals(project3Page.numberOfPassengersLabel.getText(), "Number of passengers");
        Assert.assertEquals(project3Page.numPassengerBox.getAttribute("value"), "1");

        // 9 - Validate that the “Passenger 1” category label and dropdown are displayed and “Adult (16-64)” is the default
        Assert.assertTrue(project3Page.passenger1Label.isDisplayed());
        Assert.assertTrue(project3Page.passenger1_AgeDropdown.isDisplayed());
        Assert.assertEquals(project3Page.passenger1Label.getText(), "Passenger 1");
        Assert.assertEquals(project3Page.passenger1_AgeDropdown.getAttribute("value"), "Adult (16-64)");

        // 10 - Validate that the “BOOK” button is displayed and enabled
        Assert.assertTrue(project3Page.bookButton.isDisplayed());
        Assert.assertTrue(project3Page.bookButton.isEnabled());
    }

    /** "Test Case 03"
     * Select the “One way” radio button
     * Select “Business” for the “Cabin Class” dropdown
     * Select “Illinois” for the “From” dropdown
     * Select “Florida” for the “To” dropdown
     * Select the next week for the ”Depart”
     * Select “1” for the “Number of passengers” dropdown
     * Select “Senior (65+)” for the Passenger 1 dropdown
     * Click on the “BOOK” button
     * Validate the booking information displayed below
     * DEPART
     * IL to FL
     * {dynamic date}
     * Number of passengers: 1
     * Passenger 1: Senior (65+)
     * Cabin Class: Business
     */

    @Test (priority = 3, description = "Test Case 03 - Validate Booking Information Details")
    public void ValidateBookingInformation() {

        // 1 - Select the “One way” radio button

        project3Page.one_wayRadioButton.click();
        Assert.assertTrue(project3Page.one_wayRadioButton.isSelected());

        // 2 - Select “Business” for the “Cabin Class” dropdown
        // I need help with dropdown action,
        project3Page.select_Business.click();
        Assert.assertTrue(project3Page.select_Business.isSelected());

        //* Select “Illinois” for the “From” dropdown


        // * Select “Florida” for the “To” dropdown


        // * Select the next week for the ”Depart”


        // * Select “1” for the “Number of passengers” dropdown


        // * Select “Senior (65+)” for the Passenger 1 dropdown



        // * Click on the “BOOK” button
        project3Page.bookButton.click();

        // Validate the booking information displayed below
        //     * DEPART
        //     * IL to FL
        //     * {dynamic date}
        //     * Number of passengers: 1
        //     * Passenger 1: Senior (65+)
        //     * Cabin Class: Business


    }
}
