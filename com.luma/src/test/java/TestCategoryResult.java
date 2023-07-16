
import base.BasePage;
import luma.pom.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestCategoryResult extends BasePage {
        @Test(priority = 6, groups = {"BAT"})
        public void testCategoryResult() {
            HomePage homepage = new HomePage();
            //is a method call that applies filters on the homepage,
            //though its exact functionality is not explicitly defined in the given code snippet
            homepage.doFilterTo();
            //Assert.assertTrue() method to verify if an element
            // with the locator homepage.categoryJacketResult is visible on the page.
            Assert.assertTrue(isElementVisible(homepage.categoryJacketResult));
        }
    }

