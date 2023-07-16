package bankofamerica.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AtmLocatorPage extends BasePage {

    public AtmLocatorPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='q']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@id='search-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@id='aria-map-list-header']")
    public static WebElement resultForATM;

    public void enterZipOnSearchBar(String zip) {
        sendKeysToElement(searchBar, zip);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    // Static method to search for an ATM using the zip code
    public static void searchForAtm(String zip) {
        // Create an instance of the AtmLocatorPage class
        AtmLocatorPage atmLocatorPage = new AtmLocatorPage();

        // Call the instance methods using the created instance
        atmLocatorPage.enterZipOnSearchBar(zip);
        atmLocatorPage.clickOnSearchButton();
    }
}