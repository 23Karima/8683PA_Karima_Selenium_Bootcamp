package espn.pom;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareArticleOnSM extends BasePage {

    // Web Element: pittsburgh-steelers-team article link
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[2]/div[1]/div[2]/div[2]/div/div/div/a[1]/div[1]/h3")
    public WebElement steelerArticle;

    // Method to click on the pittsburgh-steelers-team article link
    public void clickOnSteelerArticle(){
        safeClickOnElement(steelerArticle);
    }
}
