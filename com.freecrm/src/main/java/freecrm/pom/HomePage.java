package freecrm.pom;
import base.BasePage;
import freecrm.pom.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class  HomePage extends BasePage {

        // Constructor to initialize elements on the page using PageFactory
        public HomePage() {
            PageFactory.initElements(driver, this);
        }

        // WebElement representing the "Log In" button
        @FindBy(xpath = "//span[normalize-space()='Log In']")
        public WebElement loginButton;

        // Method to click on the "Log In" button and navigate to the DashboardPage
        public DashboardPage clickOnLoginButton() {
            // Click on the "Log In" button
            safeClickOnElement(loginButton);

            // Return an instance of DashboardPage class after clicking on the "Log In" button
            return new DashboardPage();
        }
}
