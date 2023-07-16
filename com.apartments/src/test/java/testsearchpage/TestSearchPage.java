package testsearchpage;

import apartments.pom.authenticationpage.SignInPage;
import apartments.pom.resultsearchpage.ResultSearchPage;
import base.BasePage;
import apartments.pom.homepage.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import apartments.pom.searchpage.SearchPage;
import utils.ExcelData;

    public class TestSearchPage extends BasePage {
        /* here in this Test case: Search
         -Navigate to the Apartments.com website
          and Log in to with a valid user account then
          Enter a specific location, such as a city or ZIP code, in the search bar.
           -Set search filters, such as price range, number of bedrooms, and amenities
         */

        @Test(priority= 3, groups= {"BAT"},dataProvider = "searchDataProvider", enabled = true)

        public void testDoSearch(String searchTerm){
            HomePage homePage = new HomePage();
            SignInPage signInPage = new SignInPage();
            SearchPage searchPage= new SearchPage();
            ResultSearchPage resultSearchPage= new ResultSearchPage();

            homePage.clickOnSignInLink();
            String email="Karima21ait@gmail.com";
            String password="Julia1234";

            signInPage.doSignIn(email,password);

            searchPage.searchTerm(searchTerm);
            resultSearchPage.doSearch();


            Assert.assertTrue(isElementVisible(resultSearchPage.searchResult));

        }
        @DataProvider(name="searchDataProvider")
        public Object[][] searchDataProvider()
        {

            String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
            ExcelData ex=new ExcelData(path);
            String data[][]=ex.readStringArrays("doSearch");
            return data;
        }
        /* Test Case Add to favorites
         *1. Log in to Apartments.com with a valid user account.
         *2. Browse through property listings and click on the "Add to Favorites" button for a few properties.
         *3.Go to the "Favorites" section in your account.
         *4.Verify that the favorite properties are displayed correctly and can be accessed from this section.

         */

        @Test(priority= 4, groups= {"BAT"}, enabled = true)
        public void testAddToFavorite(){
            HomePage homePage = new HomePage();
            SignInPage signInPage = new SignInPage();
            SearchPage searchPage= new SearchPage();
            ResultSearchPage resultSearchPage= new ResultSearchPage();


            homePage.clickOnSignInLink();
            String email="Karima21ait@gmail.com";
            String password="Julia1234";

            signInPage.doSignIn(email,password);
            String searchTerm="15108 PA, Pittsburgh";
            searchPage.searchTerm(searchTerm);
            resultSearchPage.doSearch();
            resultSearchPage.clickOnHearts();
            Assert.assertTrue(isElementVisible(resultSearchPage.favoriteResult));

        }
    }


