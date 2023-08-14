package luma.pom.cartshoppingpage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    public class AddedItemsPage extends BasePage {
        public AddedItemsPage(){
            PageFactory.initElements(driver,this);

        }

        @FindBy(xpath = "//div[@class='message-success success message']/div[contains(.,'You added Hera Pullover Hoodie to your shopping cart.')]")
        WebElement testResult;
    }

