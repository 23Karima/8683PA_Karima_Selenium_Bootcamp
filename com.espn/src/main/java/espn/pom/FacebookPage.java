package espn.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// This class represents the Facebook page in the POM framework
public class FacebookPage extends BasePage {

    // Constructor to initialize elements using PageFactory
    public FacebookPage() {
        PageFactory.initElements(driver, this);
    }

    // Web Element: Facebook login button
    @FindBy(xpath = "//*[@id=\"login_popup_cta_form\"]/div/div[5]/div/div/div[1]/div/span/span")
    public WebElement FacebookLoginButton;

    // Method to click on the Facebook login button
    public void clickOnFacebookLoginButton(){
        safeClickOnElement(FacebookLoginButton);
    }
}

