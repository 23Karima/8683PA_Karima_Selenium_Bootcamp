package espn.pom;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultOfSharingAnarticleOnSM extends BasePage {

    // Web Element: Facebook icon for social media sharing
    @FindBy(xpath = "//*[@id=\"main-container\"]/div/section[1]/article[7]/div/ul/li[1]/a/div[2]/span")
    public WebElement facebookIcon;

    // Method to check if the social media sharing icon is visible
    public boolean isSocialMediaSharingVisible(){
        return facebookIcon.isDisplayed();
    }

    // Method to click on the Facebook icon and navigate to FacebookPage
    public FacebookPage clickOnFacebookIcon(){
        safeClickOnElement(facebookIcon);
        return new FacebookPage();
    }

    public void clickOnSteelerArticle() {
    }
}
