package scripts;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Waiter;
import java.util.NoSuchElementException;

public class ProjectTest_02 extends Base{

    @BeforeMethod
    public void setPage(){
        driver.get("https://techglobal-training.com/frontend/project-2");
    }

    /** - 1
     * Navigate to https://techglobal-training.com/frontend/project-2
     * Validate that the username input box is displayed
     * Validate that the username input box is not required
     * Validate that the label of the username input box is “Please enter your username”
     * Validate that the password input box is displayed
     * Validate that the password input box is not required
     * Validate that the label of the password input box is “Please enter your password”
     * Validate the “LOGIN” button is displayed
     * Validate the “LOGIN” button is clickable
     * Validate that the button text is “LOGIN”
     * Validate the “Forgot Password?” link is displayed
     * Validate that the “Forgot Password?” link is clickable
     * Validate that the link text is “Forgot Password?”
     */

    @Test(priority = 1, description = "Test Case 01")
    public void validateTheContactInformation() {

        WebElement userNameInputBox = driver.findElement(By.id("username"));
        WebElement usernameLabel = driver.findElement(By.xpath("//label[@for='username']"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        WebElement passwordLabel = driver.findElement(By.xpath("//label[@for='password']"));
        WebElement loginButton = driver.findElement(By.id("login_btn"));
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//button[@id='login_btn']/../a"));

        Assert.assertTrue(userNameInputBox.isDisplayed());
        Assert.assertFalse(Boolean.parseBoolean(userNameInputBox.getAttribute("required")));
        Assert.assertEquals(usernameLabel.getText(), "Please enter your username");
        Assert.assertTrue(passwordInputBox.isDisplayed());
        Assert.assertFalse(Boolean.parseBoolean(passwordInputBox.getAttribute("required")));
        Assert.assertEquals(passwordLabel.getText(), "Please enter your password");
        Assert.assertTrue(loginButton.isDisplayed());
        Assert.assertTrue(loginButton.isEnabled());
        Assert.assertTrue(forgotPasswordLink.isDisplayed());
        Assert.assertTrue(forgotPasswordLink.isEnabled());
        Assert.assertEquals(forgotPasswordLink.getText(), "Forgot Password?");

    }

        /** - 2
         * Navigate to https://techglobal-training.com/frontend/project-2
         * Enter the username as “TechGlobal”
         * Enter the password as “Test1234”
         * Click on the “LOGIN” button
         * Validate the success message is displayed as “You are logged in”
         * Validate the logout button displayed with the text “LOGOUT”
         */

        @Test (priority = 2, description = "Test Case 02")
        public void validateValidLogin() {

            WebElement userNameInputBox = driver.findElement(By.id("username"));
            WebElement passwordInputBox = driver.findElement(By.id("password"));
            userNameInputBox.sendKeys("TechGlobal");
            passwordInputBox.sendKeys("Test1234");
            WebElement loginButton = driver.findElement(By.id("login_btn"));
            loginButton.click();
            WebElement successMessage = driver.findElement(By.id("success_lgn"));
            Assert.assertTrue(successMessage.isDisplayed());
            Assert.assertEquals(successMessage.getText(), "You are logged in");
            WebElement logoutButton = driver.findElement(By.id("logout"));
            Assert.assertTrue(logoutButton.isDisplayed());
            Assert.assertEquals(logoutButton.getText(), "LOGOUT");
        }


        /** - 3
         * Navigate to https://techglobal-training.com/frontend/project-2
         * Enter the username as “TechGlobal”
         * Enter the password as “Test1234”
         * Click on the “LOGIN” button
         * Click on the “LOGOUT” button
         * Validate that the login form is displayed
         */

        @Test (priority = 3, description = "Test Case 03")
        public void validateTheLogout() {

            WebElement userNameInputBox = driver.findElement(By.id("username"));
            WebElement passwordInputBox = driver.findElement(By.id("password"));
            userNameInputBox.sendKeys("TechGlobal");
            Waiter.pause(2);
            passwordInputBox.sendKeys("Test1234");
            Waiter.pause(2);
            WebElement loginButton = driver.findElement(By.id("login_btn"));
            loginButton.click();
            WebElement logoutButton = driver.findElement(By.id("logout"));
            logoutButton.click();
            WebElement loginForm = driver.findElement(By.cssSelector(".is-size-2"));
            Assert.assertTrue(loginForm.isDisplayed());

        }

    /** - 4
     * Navigate to https://techglobal-training.com/frontend/project-2
     * Click on the “Forgot Password?” link
     * Validate that the modal heading “Reset Password” is displayed
     * Validate that the close button is displayed
     * Validate that the email input box is displayed
     * Validate that the label of the email input box is “Enter your email address, and we'll send you a link to reset your password.”
     * Validate the “SUBMIT” button is displayed
     * Validate the “SUBMIT” button is clickable
     * Validate that the button text is “SUBMIT”
     */


    @Test (priority = 4, description = "Test Case 04")
    public void validateForgotPasswordLink() {
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        Assert.assertTrue(forgotPasswordLink.isDisplayed());
        forgotPasswordLink.click();
        WebElement modalHeading = driver.findElement(By.id("sub_heading"));
        Assert.assertTrue(modalHeading.isDisplayed());
        WebElement closeButton = driver.findElement(By.className("delete"));
        Assert.assertTrue(closeButton.isDisplayed());
        WebElement emailInputBox = driver.findElement(By.id("email"));
        Assert.assertTrue(emailInputBox.isDisplayed());
        WebElement labelOfTheElement = driver.findElement(By.xpath("//label[@for='email']"));
        Assert.assertEquals(labelOfTheElement.getText(), "Enter your email address and we'll send you a link to reset your password.");
        WebElement submitButton = driver.findElement(By.id("submit"));
        Assert.assertTrue(submitButton.isEnabled());
        Assert.assertEquals(submitButton.getText(), "SUBMIT");

    }

    /**
     * Test Case 05 - Validate the Reset Password modal close button
     * <p>
     * Navigate to https://techglobal-training.com/frontend/project-2
     * Click on the “Forgot Password?” link
     * Validate that the “Reset Password” modal is displayed
     * Click on the close button
     * Validate that the “Reset Password” modal is closed
     */

    @Test(priority = 5, description = "Test Case 05")
    public void validateReset() {
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//button[@id='login_btn']/../a"));
        forgotPasswordLink.click();
        WebElement modalHeading = driver.findElement(By.cssSelector(".modal-card-head"));


        try {
            Assert.assertTrue(modalHeading.isDisplayed());
            WebElement closeButton = driver.findElement(By.className("delete"));
            closeButton.click();

        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }
        Waiter.pause(1);
    }

    /**
     * Test Case 06 - Validate the Reset Password form submission
     * <p>
     * Navigate to https://techglobal-training.com/frontend/project-2
     * Click on the “Forgot Password?” link
     * Enter an email
     * Click on the “SUBMIT” button
     * Validate the form message “A link to reset your password has been sent to your email address.” is displayed under the “SUBMIT” button
     * Test Case 07 - Validate the invalid login with the empty credentials
     */
    @Test(priority = 6, description = "Test Case 06")
    public void validateTheResetPassword() {
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password?"));
        forgotPasswordLink.click();
        Faker faker= new Faker();
        WebElement emailInputBox = driver.findElement(By.id("email"));
        emailInputBox.sendKeys("zelihaarmas@gmail.com");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        WebElement confirmationMessage = driver.findElement(By.id("confirmation_message"));
        Assert.assertEquals(confirmationMessage.getText(), "A link to reset your password has been sent to your email address.");
    }

    /**
     * Test Case 07 - Validate the invalid login with the empty credentials
     * <p>
     * Navigate to https://techglobal-training.com/frontend/project-2
     * Leave username empty
     * Leave password empty
     * Click on the “LOGIN” button
     * Validate the failure message is displayed as “Invalid Username entered!” above the form
     */

    @Test (priority = 7, description = "Test Case 07")
    public void validateTheInvalidLoginWithTheEmptyCredentials() {
        WebElement loginButton = driver.findElement(By.id("login_btn"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("error_message"));
        Assert.assertEquals(errorMessage.getText(), "Invalid Username entered!");
    }

    /**
     * Test Case 08 - Validate the invalid login with the wrong username

     * Navigate to https://techglobal-training.com/frontend/project-2
     * Enter the username as “John”
     * Enter the password as “Test1234”
     * Click on the “LOGIN” button
     * Validate the failure message is displayed as “Invalid Username entered!” above the form
     */

    @Test(priority = 8, description = "Test Case 08")
    public void validateInvalidLoginWithWrongUsername() {

        WebElement userNameInputBox = driver.findElement(By.id("username"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        userNameInputBox.sendKeys("John");
        Waiter.pause(1);
        passwordInputBox.sendKeys("Test1234");
        Waiter.pause(1);
        WebElement loginButton = driver.findElement(By.id("login_btn"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("error_message"));
        Assert.assertEquals(errorMessage.getText(), "Invalid Username entered!");

    }

    /**Test Case 09 - Validate the invalid login with the wrong password

     Navigate to https://techglobal-training.com/frontend/project-2
     Enter the username as “TechGlobal”
     Enter the password as “1234”
     Click on the “LOGIN” button
     Validate the failure message is displayed as “Invalid Password entered!” above the form
     */

    @Test(priority = 9, description = "Test Case 09")
    public void validateTheInvalidLoginWithTheWrongPassword(){

        WebElement userNameInputBox = driver.findElement(By.id("username"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        userNameInputBox.sendKeys("TechGlobal");
        Waiter.pause(1);
        passwordInputBox.sendKeys("1234");
        Waiter.pause(1);
        WebElement loginButton = driver.findElement(By.id("login_btn"));
        loginButton.click();
        WebElement failureMessage = driver.findElement(By.id("error_message"));
        Assert.assertEquals(failureMessage.getText(), "Invalid Password entered!");

    }

    /** Test Case 10 - Validate the invalid login with the wrong username and password

     * Navigate to https://techglobal-training.com/frontend/project-2
     * Enter the username as “John”
     * Enter the password as “1234”
     * Click on the “LOGIN” button
     * Validate the failure message is displayed as “Invalid Username entered!” above the form
     */

    @Test(priority = 10, description = "Test Case 10")
    public void validateTheInvalidLoginWithTheWrongUsernamePassword(){

        WebElement userNameInputBox = driver.findElement(By.id("username"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        userNameInputBox.sendKeys("John");
        Waiter.pause(1);
        passwordInputBox.sendKeys("1234");
        Waiter.pause(1);
        WebElement loginButton = driver.findElement(By.id("login_btn"));
        loginButton.click();
        WebElement failureMessage = driver.findElement(By.id("error_message"));
        Assert.assertEquals(failureMessage.getText(), "Invalid Username entered!");

    }
    }
