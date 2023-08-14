import base.BasePage;
import espn.pom.HomePage;
import espn.pom.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestSearch extends BasePage {


    /*Test case: Search
     *1. Navigate to the espn.com homepage
     *2.Enter a specific search term, Sports , Teams or Player, in the search bar.
     *3.Verify that the search results are displayed correctly based on the specified criteria

     */
    @Test(priority = 1, groups = {"BAT"},dataProvider = "searchDataProvider")

    public void testDoSearch(String searchTerm) {
        HomePage homePage = new HomePage();
        SearchResultPage searchResultPage= homePage.doSearch(searchTerm);
        Assert.assertTrue(isElementVisible(searchResultPage.searchResult));
    }
    @DataProvider(name="searchDataProvider")
    public Object[][] searchDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSearch");
        return data;

    }
}

