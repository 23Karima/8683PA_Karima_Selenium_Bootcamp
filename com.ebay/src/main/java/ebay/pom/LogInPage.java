package ebay.pom;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {
    public static WebDriver driver;

    public static void main(String[] args) {
// TODO Auto-generated method stub
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.findElement(By.className("gh-p")).click();
        driver.findElement(By.xpath("/html/body")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/nav/ul"));

    }
}
