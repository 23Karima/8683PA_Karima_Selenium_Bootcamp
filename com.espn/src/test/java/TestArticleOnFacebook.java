import static base.BasePage.driver;
import base.BasePage;
import espn.pom.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import espn.pom.SearchResultPage;
import espn.pom.ResultOfSharingAnarticleOnSM;
import espn.pom.FacebookPage;
public class TestArticleOnFacebook extends BasePage{

        @Test(priority = 2, groups = {"smoke"})
        public void testShareArticle() {

            HomePage homePage = new HomePage();
            SearchResultPage resultPage= new SearchResultPage();
            homePage.clickOnSoccerButton();

    ResultOfSharingAnarticleOnSM shareAnArticleOnSocialMediaPage= new ResultOfSharingAnarticleOnSM();
            shareAnArticleOnSocialMediaPage.clickOnSteelerArticle();

            if (resultPage.isSocialMediaSharingVisible()){
                // Click on a social media sharing button
                resultPage.clickOnFacebookIcon();

                // Switch to the new window or popup
                String parentWindowHandle = driver.getWindowHandle();
                for (String windowHandle : driver.getWindowHandles()) {
                    if (!windowHandle.equals(parentWindowHandle)) {
                        driver.switchTo().window(windowHandle);
                        break;
                    }
                }


            }
        }
    }

