import base.BasePage;
import luma.pom.homepage.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp extends BasePage {

    @Test(priority = 0, groups = {"BAT"})
    public void testNavigationToApplication() {
        Homepage homepage = new Homepage();

        Assert.assertTrue(isElementVisible(homepage.logo));
    }
}