package bankofamerica.pom;

import bankofamerica.pom.AtmLocatorPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankOfAmericaPage extends BasePage {

    // WebElement for Bank of America Logo
    @FindBy(xpath = "//div[@class='logo-container']//img[@alt='Bank of America Logo']")
    public WebElement bankOfAmericaLogo;

    // WebElement for ATM Locator button
    @FindBy(xpath = "//a[@id='finCenterLocator']")
    public WebElement atmButton;

    // WebElement for language button (used for switching between English and Spanish)
    @FindBy(xpath = "//a[@id='NAV_EN_ES']")
    public WebElement languageButton;

    // Constructor to initialize elements using PageFactory
    public BankOfAmericaPage() {
        PageFactory.initElements(driver, this);
    }

    // navigates to the ATM Locator page(Clicks on the ATM Locator button)
    public AtmLocatorPage clickOnAtmButton() {
        safeClickOnElement(atmButton);
        return new AtmLocatorPage();
    }

    // Clicks on the language button (used for toggling between English and Spanish)
    public void clickOnLanguageButton() {
        safeClickOnElement(languageButton);
    }

    // Method to switch the website language to English (clicks on the language button)
    public void switchToEnglish() {
        clickOnLanguageButton();
    }
}


