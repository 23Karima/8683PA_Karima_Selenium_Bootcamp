import POM.DealsPage;
import POM.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

public class TestDeals extends BasePage {

    @Test(priority = 4, groups = {"smoke"})
    public void checkForDeals(){
        HomePage homePage = new HomePage();
        DealsPage dealsPage = new DealsPage();
        homePage.clickOnAllDealsButton();

    }
}