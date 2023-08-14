
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart extends BasePage {
    @Test(priority = 8, groups = {"BAT"})
    public void testSearchInvalidResult() {
        SearchPage page = new SearchPage();
        page.searchWrongItem("12345");
        Assert.assertTrue(isElementVisible(page.noResultsReturned));
    }
}