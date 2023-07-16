package ebay.pom;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By searchBar = By.id("gh-ac");
    private By searchButton = By.id("gh-btn");
    private By signInLink = By.xpath("//span[@id='gh-ug']/a[.='Sign in']");

    public HomePage() {
        // The BasePage constructor might initialize the WebDriver instance (driver).
        // Assuming this is happening in the BasePage class.
        // PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        driver.findElement(searchBar).sendKeys(searchTerm);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }

    public ResultPage doSearch(String searchTerm) {
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new ResultPage();
    }

    public LogInPage clickOnSignInLink() {
        driver.findElement(signInLink).click();
        return new LogInPage();
    }
}