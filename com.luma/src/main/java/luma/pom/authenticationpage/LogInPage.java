
import base.BasePage;
import luma.pom.homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testAuthentication extends BasePage {

    @Test(priority = 5, groups = {"BAT"})

    public void testLoginWithValidCredentials() {

        LogInPage logInPage = new LogInPage();
        String validEmail = "connie.smith@gmail.com";
        String validPassword = "AydenLiam1213";
        logInPage.getLogIn(validEmail, validPassword);
        Assert.assertTrue(isElementVisible(logInPage.resultLoginMessage));

    }

    @Test(priority = 6, groups = {"BAT"})
    public void testLoginWithInvalidCredentials() {

        LoginWithInvalidCredentials loginWithInvalidCredentials = new LoginWithInvalidCredentials();
        String invalidEmail = "connor.smith@gmail.com";
        String invalidPassword = "Ayden1213";
        loginWithInvalidCredentials.getLogIn(invalidEmail, invalidPassword);
        Assert.assertTrue(isElementVisible(loginWithInvalidCredentials.errorMessageLogin));
    }

    @Test(priority = 7, groups = {"BAT"})
    public void testLog(){
        LogInPage logInPage = new LogInPage();
        String validEmail = "connie.smith@gmail.com";
        String validPassword = "AydenLiam1213";
        logInPage.getLogIn(validEmail, validPassword);
        Homepage homepage= new Homepage();
        homepage.doLogOut();
        Assert.assertTrue(isElementVisible(homepage.messageLogOut));
    }
}