package verizon.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    // Constructor to initialize elements using PageFactory
    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    // WebElement for the 'Filter' header on the search page
    @FindBy(xpath = "//h2[normalize-space()='Filter']")
    public WebElement filterHeader;

    // Note: The 'filterHeader' field might not be used in this class,
    // but it can be accessed by test scripts that use the SearchPage class.

}
