
import base.BasePage;
import luma.pom.CreateAccount;
import luma.pom.HomePage;
import luma.pom.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
    public class TestLogin extends BasePage {
        @Test(priority = 1, groups = {"BAT"})// create account
        public void testCreateAccountInApplication() {
            CreateAccount myaccount = new CreateAccount();
            myaccount.createAccount();
            Assert.assertTrue(isElementVisible(myaccount.registeruservalidation));
        }
        @Test(priority = 2, groups = {"BAT"}) // test log in page.
        public void testLogin() {
            LoginPage loginpage = new LoginPage();
            loginpage.login();
            Assert.assertTrue(isElementVisible(loginpage.welcompagetext));
            HomePage homepage = new HomePage();
            Assert.assertTrue(isElementVisible(homepage.logo));
        }
    }


