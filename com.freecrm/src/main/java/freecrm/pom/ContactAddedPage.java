package freecrm.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactAddedPage extends BasePage {

    public ContactAddedPage(){
        PageFactory.initElements(driver,this);


    }
    @FindBy(xpath = "//i[@class='large user red icon']")
    public WebElement redIcon;
}