package testuserpreferencespage;

import apartments.pom.authenticationpage.SignInPage;
import apartments.pom.userpreferencespage.UserPreferencesPage;
import base.BasePage;
import apartments.pom.homepage.HomePage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import apartments.pom.searchpage.SearchPage;
import apartments.pom.resultsearchpage.ResultSearchPage;
import utils.ExcelData;

    public class TestUserPreferencesPage extends BasePage {

        @Test(priority = 5, groups = {"BAT"}, enabled = true)
         /*
           Step 1: Open the homepage
           Step 2: Click on the SignIn link
           Step 3: Enter email and password to sign in
           Step 4: Hover over the account section
           Step 5: Enter phone number, street address, and city in account settings
           Step 6: Save the changes
           Step 7: Verify if changes are successfully saved

          */

        public void testAccountSettings() {
            HomePage homePage = new HomePage();
            SignInPage signInPage = new SignInPage();
            UserPreferencesPage accountSettingPage= new UserPreferencesPage();

            homePage.clickOnSignInLink();
            String email = "Karima21ait@gmail.com";
            String password = "Julia1234";

            signInPage.doSignIn(email, password);
            homePage.hoverClickOnAccount();
            String phoneNumber = "3474178702";
            String streetAddress = "7117 Sanlin dr";
            String city ="Pittsburgh";

            accountSettingPage.doSaveChanges(phoneNumber,streetAddress, city);

        }
        @Test(priority= 6, groups= {"BAT"},dataProvider = "accountSettingsDataProvider", enabled = true)
          /*
          Verify if changes are successfully saved
          Repeat the above steps with different data from the data provider
          */
        public void testDoSaveUpdates(String phoneNumber,String streetAddress,String city){
            HomePage homePage = new HomePage();
            SignInPage signInPage = new SignInPage();
            UserPreferencesPage accountSettingPage= new UserPreferencesPage();

            homePage.clickOnSignInLink();
            String email = "karima21ait@gmail.com";
            String password = "Julia1234";

            signInPage.doSignIn(email, password);
            homePage.hoverClickOnAccount();
            accountSettingPage.doSaveChanges(phoneNumber,streetAddress, city);

        }
        @DataProvider(name="accountSettingsDataProvider")
        public Object[][] accountSettingDataProvider()
        {

            String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
            ExcelData ex=new ExcelData(path);
            String data[][]=ex.readStringArrays("doSaveUpdates");
            return data;

        }

    }
