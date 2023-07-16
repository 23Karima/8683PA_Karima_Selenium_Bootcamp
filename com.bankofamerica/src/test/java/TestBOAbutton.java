

import bankofamerica.pom.AtmLocatorPage;
import bankofamerica.pom.HomePage;
import bankofamerica.pom.BankOfAmericaPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TestBOAbutton extends BasePage {

    @Test(priority = 1, groups = {"BAT"})//Test method to verify the Bank of America button functionality
    public void testBoaButton() {
        // Initialize the page objects for Home Page and Bank of America Page
        HomePage homePage = new HomePage();
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();

        // Step 1: Click on the Bank of America button on the Home Page
        homePage.clickOnBOAButton();

        // Step 2: Switch to the newly opened window (Bank of America Page)
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window : windowHandles) {
            if (!window.equals(mainWindowHandle)) {
                driver.switchTo().window(window);
                break;
            }
        }

        // Step 3: Assert that the Bank of America logo is visible in the new window
        Assert.assertTrue(isElementVisible(bankOfAmericaPage.bankOfAmericaLogo));
    }

    @Test(priority = 2, groups = {"BAT"})
    public void testTableDataBoa() {
        // Initialize the page objects for Bank of America Page
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();

        // Step 1: Click on the ATM button on the Bank of America Page
        AtmLocatorPage atmLocatorPage = bankOfAmericaPage.clickOnAtmButton();

        // Step 2: Perform test steps related to the table data on the Bank of America page
        // For example, you can enter a zip code and perform a search for ATMs in that area.
        String zipCode = "12345";
        atmLocatorPage.enterZipOnSearchBar(zipCode);
        atmLocatorPage.clickOnSearchButton();

        // Step 3: Assert the results of the table data or perform any other verification
        // For example, you can assert that the resultForATM element is visible on the page.
        Assert.assertTrue(isElementVisible(atmLocatorPage.resultForATM));
    }
}