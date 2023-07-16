

import base.BasePage;
import luma.pom.SearchPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

import java.util.Base64;

public class SearchItemWithDP extends BasePage {

    @Test(priority = 4, groups = {"BAT"}, dataProvider = "searchItems")
    public void testSearchItemDataProvider(String item) {
        SearchPage dosearchpage = new SearchPage();
        dosearchpage.searchItem(item);
        String textactual = getTrimmedElementText(dosearchpage.searchedheadertext);
        String expected = "Search results for: '" + item + "'";
        Assert.assertEquals(textactual, expected);

    }

    @DataProvider(name = "searchItems")
    public String[][] searchItemProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("searchSheet");
        return data;

    }

}