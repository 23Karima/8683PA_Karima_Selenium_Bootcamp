
import bankofamerica.pom.BankOfAmericaPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLanguage extends BasePage {

    @Test(priority = 1, groups = {"BAT"})
    public void testSwitchLanguages() {
        // Step 1: Initialize the BankOfAmericaPage class
        BankOfAmericaPage bankOfAmericaPage = new BankOfAmericaPage();

        // Step 2: Click on the language button to switch languages
        bankOfAmericaPage.clickOnLanguageButton();

        // Step 3: Assert that the language button is visible after switching languages
        Assert.assertTrue(isElementVisible(bankOfAmericaPage.languageButton));
    }
}