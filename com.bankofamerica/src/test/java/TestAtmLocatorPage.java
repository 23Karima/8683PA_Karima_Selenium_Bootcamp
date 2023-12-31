

import bankofamerica.pom.AtmLocatorPage;
import bankofamerica.pom.BankOfAmericaPage;
import bankofamerica.pom.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;
import java.util.Set;

public class TestAtmLocatorPage extends BasePage {

    @Test(priority = 1, groups = {"BAT"}, dataProvider = "searchatmlocatordataprovider")

    public void testSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocatorPage atmLocatorPage = new AtmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchatmlocatordataprovider")
    public String[][] atmLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("bankofamerica_zip");
        return data;

    }

    @Test(priority = 2, groups = {"BAT"}, dataProvider = "searchinvalidatmlocatordataprovider")
    public void testInvalidSearchAtmLocator(String zip) {

        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();
        AtmLocatorPage atmLocatorPage = new AtmLocatorPage();

        bankOfAmericaPage.clickOnAtmButton();
        atmLocatorPage.searchForAtm(zip);
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }


    @DataProvider(name = "searchinvalidatmlocatordataprovider")
    public String[][] atmInvalidLocatorDataProvider() {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("invalid_zip");
        return data;
    }
}