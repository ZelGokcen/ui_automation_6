package scripts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Project3Page;
import utils.DropdownHandler;
import utils.Waiter;


public class _03_ProjectTest extends Base{

    @BeforeMethod
    public void setPage() {
        driver.get("https://techglobal-training.com/frontend/project-3");
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
        Assert.assertTrue(project3Page.cabinClassDropdownList.isDisplayed());

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
        Assert.assertTrue(project3Page.numberOfPassengerSelect.isDisplayed());
        Assert.assertEquals(project3Page.numberOfPassengerSelect.getAttribute("value"), "1");

        //(//div[@class='select']/select)[4]

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

    @Test (priority = 2, description = "Test Case 02 - Validate RoundTrip Radio Button")
    public void validateRoundTripRadioButton(){

        // 1 - Click on the “Round trip” radio button and validate it is selected
        project3Page.roundTripRadioButton.click();
        Assert.assertTrue(project3Page.roundTripRadioButton.isSelected());

        // 2 - Validate that the “One way” radio button is not selected
        Assert.assertFalse(project3Page.one_wayRadioButton.isSelected());

        // 3 - Validate that the “Cabin Class” label and dropdown are displayed
        Assert.assertTrue(project3Page.cabinClassLabel.isDisplayed());
        Assert.assertTrue(project3Page.cabinClassDropdownList.isDisplayed());

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
        Assert.assertTrue(project3Page.numberOfPassengerSelect.isDisplayed());
        Assert.assertEquals(project3Page.numberOfPassengersLabel.getText(), "Number of passengers");
        Assert.assertEquals(project3Page.numberOfPassengerSelect.getAttribute("value"), "1");

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
       // project3Page.cabinClassDropdownList.get(2).click();
        project3Page.select_Business.click();
        Assert.assertTrue(project3Page.select_Business.isSelected());

        //* Select “Illinois” for the “From” dropdown
        DropdownHandler.selectByVisibleText(project3Page.fromDropdown, "Illinois");
        Waiter.pause(5);


        // * Select “Florida” for the “To” dropdown
        DropdownHandler.selectByVisibleText(project3Page.toDropdown,"Florida");


        // * Select the next week for the ”Depart”
        project3Page.month.sendKeys("6");
        project3Page.day.sendKeys("18");
        project3Page.year.sendKeys("2023");


        // * Select “1” for the “Number of passengers” dropdown
        DropdownHandler.selectByIndex(project3Page.numberOfPassengerSelect,0);

        // * Select “Senior (65+)” for the Passenger 1 dropdown
        DropdownHandler.selectByVisibleText(project3Page.passenger1_AgeDropdown,"Senior (65+)");

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

    /** "Test Case 04"
     * Select the “Round trip” radio button
     * Select “First” for the “Cabin Class” dropdown
     * Select “California” for the “From” dropdown
     * Select “Illinois” for the “To” dropdown
     * Select the next week for the ”Depart”
     * Select the next month for the “Return”
     * Select “1” for the “Number of passengers” dropdown
     * Select “Adult (16-64)” for the Passenger 1 dropdown
     * Click on the “BOOK” button
     * Validate the booking information displayed below
     * DEPART
     * CA to IL
     * {dynamic date}
     * Number of passengers: 1
     * Passenger 1: Adult (16-64)
     * Cabin Class: First
     *
     *
     * RETURN
     * IL to CA
     * {dynamic date}
     */


    @Test(priority = 4, description = "Test Case 04 - Validate The Booking Information Displayed Below")
    public void validateTheBookingFor1PassengerAndRoundTrip(){
        project3Page.roundTripRadioButton.click();

        //project3Page.cabinClassDropdownList.get(3).click();

        //fromState.get()
        //project3Page.fromState
        DropdownHandler.selectByVisibleText(project3Page.fromStateSelect, "California");
        Waiter.pause(5);

        DropdownHandler.selectByVisibleText(project3Page.toStateSelect,"Illinois");

        project3Page.month.sendKeys("6");
        project3Page.day.sendKeys("18");
        project3Page.year.sendKeys("2023");

        project3Page.monthReturn.sendKeys("7");
        project3Page.dayReturn.sendKeys("18");
        project3Page.yearReturn.sendKeys("2023");


        DropdownHandler.selectByIndex(project3Page.numberOfPassengerSelect,0);
        DropdownHandler.selectByVisibleText(project3Page.passenger1_AgeDropdown,"Adult (16-64)");

        project3Page.bookButton.click();

        Assert.assertTrue(project3Page.departLabel.isDisplayed());
        Assert.assertEquals(project3Page.fromToConfirm.getText(),"CA to IL");
        Assert.assertEquals(project3Page.returnFrom.getText(),"IL to CA");

        String [] expectedResults = {"Sun Jun 18 2023", "Tue Jul 18 2023","Number of Passengers: 1","Passenger 1: Adult (16-64)","Cabin class: First"};

        for (int i = 0; i < project3Page.dateOfFlightConfirm.size(); i++) {
            Assert.assertEquals(project3Page.dateOfFlightConfirm.get(i).getText(),expectedResults[i]);
        }

        Assert.assertEquals(project3Page.returnConfirmDate.getText(),"Tue Jul 18 2023");
        System.out.println(project3Page.returnConfirmDate);
    }

    /** "Test Case 05"
     * Select the “One way” radio button
     * Select “Premium Economy” for the “Cabin Class” dropdown
     * Select “New York” for the “From” dropdown
     * Select “Texas” for the “To” dropdown
     * Select the next day for the ”Depart”
     * Select “2” for the “Number of passengers” dropdown
     * Select “Adult (16-64)” for the Passenger 1 dropdown
     * Select “Child (2-11)” for the Passenger 2 dropdown
     * Click on the “BOOK” button
     * Validate the booking information displayed below
     * DEPART
     * NY to TX
     * {dynamic date}
     * Number of passengers: 2
     * Passenger 1: Adult (16-64)
     * Passenger 2: Child (2-11)
     * Cabin Class: Premium Economy
     */

    @Test(priority = 5, description = "Test Case 05 - Validate The Booking For 2 Passenger And OneWay")
    public void validateTheBookingFor2PassengerAndOneWay(){


        // Select the “One way” radio button
        project3Page.one_wayRadioButton.click();

        // Select “Premium Economy” for the “Cabin Class” dropdown
       // project3Page.cabinClassDropdownList.get(1).click();

        //Select “New York” for the “From” dropdown
        //fromState.get()
        //project3Page.fromState
        DropdownHandler.selectByVisibleText(project3Page.fromDropdown, "New York");
        Waiter.pause(5);

        //Select “Texas” for the “To” dropdown
        DropdownHandler.selectByVisibleText(project3Page.toDropdown,"Texas");

        // Select the next day for the ”Depart”
        project3Page.month.sendKeys("6");
        project3Page.day.sendKeys("13");
        project3Page.year.sendKeys("2023");

        //Select “2” for the “Number of passengers” dropdown
        DropdownHandler.selectByIndex(project3Page.numberOfPassengerSelect,1);

        // Select “Adult (16-64)” for the Passenger 1 dropdown
        DropdownHandler.selectByVisibleText(project3Page.passenger1_AgeDropdown,"Adult (16-64)");

        // Select “Child (2-11)” for the Passenger 2 dropdown
        DropdownHandler.selectByVisibleText(project3Page.passenger1_AgeDropdown,"Child (2-11)");

        // Click on the “BOOK” button
        project3Page.bookButton.click();

        // Validate the booking information displayed below
        Assert.assertTrue(project3Page.departLabel.isDisplayed());
        // NY to TX
        Assert.assertEquals(project3Page.fromToConfirm.getText(),"NY to TX");


        String [] expectedResults = {"Tue Jun 13 2023","Number of Passengers: 2","Passenger 1: Adult (16-64)","Passenger 2: Child (2-11)","Cabin class: Premium Economy"};

        for (int i = 0; i < project3Page.dateOfFlightConfirm.size(); i++) {
            Assert.assertEquals(project3Page.dateOfFlightConfirm.get(i).getText(),expectedResults[i]);
            System.out.println(project3Page.dateOfFlightConfirm);
        }


    }
}
