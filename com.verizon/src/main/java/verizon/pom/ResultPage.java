package verizon.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    // Constructor to initialize elements using PageFactory
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    // WebElement for the search result items
    @FindBy(xpath = "//div[@id='slSearch-Distance0Id']")
    public WebElement searchResultItems;
}