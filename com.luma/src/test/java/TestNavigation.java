
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class TestNavigation {

        // Test method to verify if the logo is visible on the homepage
        @Test(priority = 0, groups = {"BAT"})
        public void testLogoVisibility() {
            WebDriver driver = new ChromeDriver(); // Initialize WebDriver
            driver.manage().window().maximize();
            driver.get("https://www.example.com"); // Replace with your actual homepage URL

            WebElement logo = driver.findElement(By.id("logo")); // Replace "logo" with the actual ID of the logo element
            Assert.assertTrue(logo.isDisplayed(), "Logo is not visible on the homepage.");

            driver.quit(); // Close the browser after the test is finished
        }
    }


