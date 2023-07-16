package testauthentication;

import apartments.pom.authenticationpage.SignInPage;
import base.BasePage;
import apartments.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    // Step 1: Navigate to "www.apartments.com"
    // Step 2: Click on the "Sign In" button/link.
    // Step 3: Enter a valid email address in the email input field
    // Step 4: Enter a valid password in the password input field.
    // Step 5: Click on the "Sign In" button
    // Step 6: Verify that the user is successfully logged in and redirected to the home page.

    @Test(priority = 1, groups = "BAT")

    public void testDoSignIn() {

        HomePage homePage = new HomePage();

        homePage.clickOnSignInLink();
        ExcelData excelData = new ExcelData(BasePage.DATA_PATH);
        SignInPage signInPage = new SignInPage();
        String[][] credentials = excelData.readStringArrays("doSignIn");
        String email = credentials[0][0];
        String password = credentials[0][1];

        signInPage.doSignIn(email, password);


        Assert.assertTrue(checkElementPresent(homePage.userName));
    }


    @Test(priority= 1, groups= {"BAT"},dataProvider = "signInDataProvider", enabled = true)
    public void testUserSignIn(String email,String password){
        SignInPage signInPage = new SignInPage();
        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();

        signInPage.doSignIn(email,password);
        Assert.assertTrue(checkElementPresent(homePage.loggedInUsername));
    }

    @DataProvider(name="signInDataProvider")
    public Object[][] testSignInUserDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }
    // Step 1: Navigate to "www.apartments.com"
    // Step 2: Click on the "Sign In" button/link.
    // Step 3: Enter a valid email address in the email input field
    // Step 4: Enter a valid password in the password input field.
    // Step 5: Click on the "Sign In" button
    // Step 6: Verify that the user is successfully logged in and redirected to the home page.
    // Step 7: Hover over the username located in the header menu
    // Step 8: Click on the "Sign Out" link
    // Step 9: Verify that you are redirected to the homepage or a login page.
    @Test(priority = 2, groups={"BAT"}, dataProvider = "signOutDataProvider", enabled = true)

    public void testLogOut(String email,String pass){
        HomePage homePage= new HomePage();
        SignInPage signInPage = new SignInPage();


        homePage.clickOnSignInLink();


        signInPage.doSignIn(email,pass);
        homePage.doSignOut();

        Assert.assertTrue(isElementVisible(homePage.signInLink));
    }
    @DataProvider(name="signOutDataProvider")
    public Object[][] testSignOutDataProvider()
    {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("doSignIn");
        return data;

    }

}