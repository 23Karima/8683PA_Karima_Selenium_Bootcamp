package verizon.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    // Constructor to initialize elements using PageFactory
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // WebElement for the search button
    @FindBy(xpath = "//button[@id='gnav20-search-icon']")
    public WebElement searchButton;

    // WebElement for the search input box
    @FindBy(xpath = "//input[@id='search_box_gnav_input']")
    public WebElement inputSearchBox;

    // WebElement for the 'iPhone' search term link
    @FindBy(xpath = "//a[@aria-label='iPhone 1 of 9']//span[contains(text(),'iPhone')]")
    public WebElement iPhoneSearchTerm;

    // WebElement for the 'Stores' button
    @FindBy(xpath = "//a[@data-label='Stores']")
    public WebElement storesButton;

    // WebElement for the store search bar
    @FindBy(xpath = "//input[@id='storesData']")
    public WebElement storeSearchBar;

    // WebElement for the search dropdown
    @FindBy(xpath = "//li[@tabindex='-1']")
    public WebElement searchDropdown;

    // Clicks on the search button
    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    // Enters the search term 'iphone' into the search input box
    public void enterSearchTerm() {
        String searchTerm = "iphone";
        sendKeysToElement(inputSearchBox, searchTerm);
    }

    // Hovers over the 'iPhone' search term link
    public void hoverOveriPhone() {
        hoverOverElement(iPhoneSearchTerm);
    }

    // Clicks on the 'iPhone' search term link
    public void clickOnSearchTerm() {
        safeClickOnElement(iPhoneSearchTerm);
    }

    // Performs a search for the term 'iphone'
    public void searchTerm() {
        clickOnSearchButton();
        enterSearchTerm();
        hoverOveriPhone();
        clickOnSearchTerm();
    }

    // Clicks on the 'Stores' button
    public void clickOnStoresButton() {
        safeClickOnElement(storesButton);
    }

    // Enters the zip code into the store search bar
    public void enterZipCode(String zip) {
        sendKeysToElement(storeSearchBar, zip);
    }

    // Performs a search using the provided zip code and returns the ResultPage
    public ResultPage doSearch(String zip) {
        clickOnStoresButton();
        enterZipCode(zip);
        safeClickOnElement(searchDropdown);

        return new ResultPage();
    }
}
