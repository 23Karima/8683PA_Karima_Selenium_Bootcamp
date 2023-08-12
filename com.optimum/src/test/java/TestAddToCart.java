import base.BasePage;
import POM.AddToCartPage;
import POM.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToCart extends BasePage {

    @Test(priority = 2, groups = {"Smoke"})
    public void testAddToCart(){
        HomePage homePage = new HomePage();
        AddToCartPage addToCartPage = new AddToCartPage();

        homePage.clickOnShopPlansButton();
        String zipCode = "15108";
        addToCartPage.addToCart(zipCode);
        Assert.assertTrue(isElementVisible(addToCartPage.CartHeader));
    }
}