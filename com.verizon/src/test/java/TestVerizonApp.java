import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;
import verizon.pom.HomePage;
import verizon.pom.ResultPage;
import verizon.pom.SearchPage;

public class TestVerizonApp extends BasePage {

    // Test method to perform a basic search and verify search results
    @Test(priority = 1, groups = "smoke")
    public void testDoSearch() {
        HomePage homePage = new HomePage();
        homePage.searchTerm();
        // Add any additional verifications or assertions if needed for the search results
    }

    // Test method to search using provided zip code and verify search results
    @Test(priority = 2, groups = {"BAT"}, dataProvider = "searchDataProvider")
    public void testSearchResult(String zip) {
        HomePage homePage = new HomePage();
        ResultPage resultsPage = new ResultPage();
        homePage.doSearch(zip);
        Assert.assertTrue(isElementVisible(resultsPage.searchResultItems));
        // Add any additional verifications or assertions if needed for the search results
    }

    // DataProvider method to provide search zip codes from test_data.xlsx
    @DataProvider(name = "searchDataProvider")
    public Object[][] searchResultDataProvider() {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("verizon_zip");
        return data;
    }
}