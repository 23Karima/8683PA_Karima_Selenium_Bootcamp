package apartments.pom.searchpage;

import apartments.pom.resultsearchpage.ResultSearchPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//input[@id='quickSearchLookup']")
    private WebElement searchBar;

    @FindBy(xpath = "//span[.='Search']")
    private WebElement searchButton;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        sendKeysToElement(searchBar, searchTerm);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public ResultSearchPage searchTerm(String searchTerm) {
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new ResultSearchPage();
    }
}