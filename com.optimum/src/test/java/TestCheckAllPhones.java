import base.BasePage;
import POM.HomePage;
import POM.MobilePage;
import org.testng.annotations.Test;

public class TestCheckAllPhones extends BasePage {

    @Test
    public void checkForPhones(){
        HomePage homePage = new HomePage();
        MobilePage mobilePage = new MobilePage();
        homePage.clickOnAllPhonesButton();
    }
}