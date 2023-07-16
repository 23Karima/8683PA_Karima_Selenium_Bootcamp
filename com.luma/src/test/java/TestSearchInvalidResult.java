
import base.BasePage;
import luma.pom.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchInvalidResult extends BasePage {
    @Test(priority = 8, groups = {"BAT"})
    public void testSearchInvalidResult() {
        SearchPage page = new SearchPage();
        page.searchWrongItem("12345");
        Assert.assertTrue(isElementVisible(page.noResultsReturned));
    }
}