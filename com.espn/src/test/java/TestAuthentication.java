
import base.BasePage;
import espn.pom.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

// Test class for user authentication (login and logout)
public class TestAuthentication extends BasePage {

    // Test Case: User Login on ESPN.com
    @Test(priority = 1, groups = {"BAT"}, dataProvider = "signInDataProvider")
    public void testUserSignIn(String email, String password) {
        // Initialize HomePage
        HomePage homePage = new HomePage();

        // Perform user login
        homePage.doLogin(email, password);

        // Assert that user is successfully logged in
        Assert.assertTrue(isElementVisible(homePage.assertLogin()));
    }

    @DataProvider(name = "signInDataProvider")
    public Object[][] testSignInUserDataProvider() {
        // Get test data from Excel
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }

    // Test Case: User Logout on ESPN.com
    @Test(priority = 2, groups = {"BAT"}, dataProvider = "signOutDataProvider")
    public void testUserSignOut(String email, String password) {
        // Initialize HomePage
        HomePage homePage = new HomePage();

        // Perform user login
        homePage.doLogin(email, password);

        // Perform user logout
        homePage.doLogOut();

        // Assert that user is successfully logged out
        Assert.assertTrue(isElementVisible(homePage.doAssetLogOut()));
    }

    @DataProvider(name = "signOutDataProvider")
    public Object[][] testSignOutUserDataProvider() {
        // Get test data from Excel
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex = new ExcelData(path);
        String data[][] = ex.readStringArrays("doSignIn");
        return data;
    }
}
