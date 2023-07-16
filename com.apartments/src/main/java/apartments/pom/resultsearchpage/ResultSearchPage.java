package apartments.pom.resultsearchpage;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultSearchPage extends BasePage {

    public ResultSearchPage() {
        PageFactory.initElements(driver, this);
    }

    // WebElements
    @FindBy(xpath = "//a[@id='rentRangeLink']//i[@class='storyicon down2StoryIcon']")
    public WebElement priceDropDown;

    @FindBy(xpath = "//ul[@class='minRentOptions js-minRentOptions active']/li[@class='active']")
    public WebElement noMinOption;

    @FindBy(xpath = "//input[@id='max-input']")
    public WebElement maxRentButton;

    @FindBy(xpath = "//ul[@id='maxRentOptions']/li[.='$1,800']")
    public WebElement maxRentSelected;

    @FindBy(xpath = "//span[.='< $1.8k']")
    public WebElement searchResult;

    @FindBy(xpath = "//div[@id='placardContainer']//li[1]//a[@href='javascript:void(0);']")
    public WebElement heartIcon1;

    @FindBy(xpath = "//div[@id='placardContainer']//li[2]//a[@href='javascript:void(0);']")
    public WebElement heartIcon2;

    @FindBy(xpath = "//div[@id='notificationsFavorites']/i[@class='storyicon favoriteOutlineStoryIcon']")
    public WebElement favoriteSection;

    @FindBy(xpath = "//div[@id='notificationsFavorites']/span[@class='label']")
    public WebElement favoriteResult;

    // Click on the price drop-down
    public void clickOnPriceDropDown() {
        safeClickOnElement(priceDropDown);
    }

    // Click on the "No Min" option
    public void clickOnNoMinOption() {
        safeClickOnElement(noMinOption);
    }

    // Click on the max rent button
    public void clickOnMaxRentButton() {
        safeClickOnElement(maxRentButton);
    }

    // Click on the selected max rent
    public void clickOnMaxRentSelected() {
        safeClickOnElement(maxRentSelected);
    }

    // Perform the search
    public void doSearch() {
        clickOnPriceDropDown();
        clickOnNoMinOption();
        clickOnMaxRentButton();
        clickOnMaxRentSelected();
    }

    // Click on hearts/icons
    public void clickOnHearts() {
        safeClickOnElement(heartIcon1);
        safeClickOnElement(heartIcon2);
        safeClickOnElement(favoriteSection);
    }
}