
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LoginTest {

        private WebDriver driver;

        private void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.ebay.com");
        }

        @Test
        public void testLogin() {
            setUp();

            // My test step :
            driver.findElement(By.className("gh-p")).click();
            driver.findElement(By.xpath("/html/body")).click();
            driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/nav/ul"));

            // Add some assertions or validations here to confirm login functionality.
            // For example, you might use TestNG's assertions like:
            // Assert.assertTrue(condition, "Error message if the condition is false");

            driver.quit();
        }


}
