
import luma.pom.cartshoppingpage.CombinedPage;
import luma.pom.cartshoppingpage.AddItemPage;
import luma.pom.cartshoppingpage.AddedItemsPage;
import luma.pom.homepage.Homepage;
import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends BasePage {

    @Test(priority = 8, groups="BAT")
    public void testAddItemToCart(){
        AddItemPage addItemPage=new AddItemPage();

        String[] searchTerms = excelData.readStringArray("testDoSearch");
        String searchTerm = searchTerms[9];
        addItemPage.addItemToTheCart(searchTerm);

        Assert.assertTrue(isElementVisible(AddedItemPage.driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"))));

    }

    @Test(priority = 9, groups = {"BAT"})
    public void addModifyRemoveFromCartData() {
        Homepage homepage = new Homepage();
        homepage.doSearch("Duffle Bag");
        AddModifyCartPage addModifyRemove=new AddModifyCartPage();
        addModifyRemove.addToCartItem();
        addModifyRemove.modifyItem();
        addModifyRemove.removeCartItem();
        Assert.assertTrue(isElementVisible(addModifyRemove.noItemsInCart));

    }
}