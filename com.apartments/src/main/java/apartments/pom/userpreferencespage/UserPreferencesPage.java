package apartments.pom.userpreferencespage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPreferencesPage extends BasePage {
    // WebElements
    @FindBy(id = "iframeAccountSettings")
    public WebElement preferencesIframe;

    @FindBy(id = "cpid1-phone")
    public WebElement phoneNumberInputField;

    @FindBy(id = "cpid1-addressLine1")
    public WebElement streetAddressInputField;

    @FindBy(id = "cpid1-city")
    public WebElement cityInputField;

    @FindBy(id = "save-settings-button")
    public WebElement saveButton;

    //Here constructor initializes the page object using the PageFactory class from Selenium's Pframework
    public UserPreferencesPage() {
        PageFactory.initElements(driver, this);
    }

    // Switch to the preferences iframe
    public void switchToIframe() {
        switchToFrameByElement(preferencesIframe);
    }

    // Enter text in an input field
    public void enterText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    // Click on an element
    public void click(WebElement element) {

        element.click();

    }

    // Save changes by entering phone number, street address, and city
    public void doSaveChanges(String phoneNumber, String streetAddress, String city) {
        switchToIframe(); // Switch to the preferences iframe
        enterText(phoneNumberInputField, phoneNumber); // Enter phone number
        enterText(streetAddressInputField, streetAddress); // Enter street address
        enterText(cityInputField, city); // Enter city
        click(saveButton); // Click on save button
    }
}