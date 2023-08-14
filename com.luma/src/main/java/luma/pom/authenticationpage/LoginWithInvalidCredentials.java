package luma.pom.authenticationpage;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class represents the login page for testing invalid login credentials.
 * It provides methods to interact with the login page elements and perform an invalid login attempt.
 */
public class LoginWithInvalidCredentials extends BasePage {

        // Web elements on the login page
        @FindBy(xpath = "//div[@class='panel header']//a[contains(.,'Sign In')]")
        public WebElement loginLink;

        @FindBy(xpath = "//input[@id='email']")
        public WebElement inputEmail;

        @FindBy(xpath = "//input[@name='login[password]']")
        public WebElement inputPassword;

        @FindBy(xpath = "//button[@class='action login primary']/span[.='Sign In']")
        public WebElement loginButton;

        @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")
        public WebElement errorMessageLogin;

        /**
         * Initializes page elements using the driver.
         */
        public LoginWithInvalidCredentials() {
            PageFactory.initElements(driver, this);
        }

        /**
         * Clicks the login link on the page.
         */
        public void clickLoginLink() {
            safeClickOnElement(loginLink);
        }

        /**
         * Enters an invalid email into the input field.
         *
         * @param invalidEmail The invalid email to be entered.
         */
        public void setInputInvalidEmail(String invalidEmail) {
            sendKeysToElement(inputEmail, invalidEmail);
        }

        /**
         * Enters an invalid password into the input field.
         *
         * @param invalidPassword The invalid password to be entered.
         */
        public void setInputInvalidPassword(String invalidPassword) {
            sendKeysToElement(inputPassword, invalidPassword);
        }

        /**
         * Clicks the login button to attempt the login.
         */
        public void clickLoginButton() {
            safeClickOnElement(loginButton);
        }

        /**
         * Performs an invalid login attempt with provided email and password.
         *
         * @param invalidEmail    The invalid email to use for login.
         * @param invalidPassword The invalid password to use for login.
         */
        public void performInvalidLogin(String invalidEmail, String invalidPassword) {
            clickLoginLink();
            setInputInvalidEmail(invalidEmail);
            setInputInvalidPassword(invalidPassword);
            clickLoginButton();
        }
    }

