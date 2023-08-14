package luma.pom.cartshoppingpage;

import base.BasePage;
import luma.pom.authenticationpage.WelcomeLoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CombinedPage extends BasePage {

    // AddModifyCartPage
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement cartButton;

    @FindBy(xpath = "//a[contains(.,'Remove')]")
    public WebElement removeButton;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement modifyButton;

    @FindBy(xpath = "//img[@alt='Joust Duffle Bag']")
    public WebElement productItemLink;

    @FindBy(xpath = "//button[@title='Update']")
    public WebElement updateButton;

    @FindBy(xpath = "//span[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//strong[@class='subtitle empty']")
    public WebElement noItemsInCart;

    // ModifyFromCartPage
    @FindBy(xpath = "//div[@class='panel header']//a[contains(.,'Sign In')]")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement inputPassword;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/div[1]/a")
    public WebElement cartIcon;

    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/checkout/cart/configure/id/219863/product_id/1060/']")
    public WebElement editIcon;

    @FindBy(xpath = "//div[@class='swatch-attribute size']//div[.='M']")
    public WebElement sizeMBox;

    @FindBy(xpath = "//span[.='Update Cart']")
    public WebElement updateCartButton;

    @FindBy(xpath = "//div[.='Hera Pullover Hoodie was updated in your shopping cart.']")
    public WebElement resultUpdateText;

    // RemoveItemPage
    @FindBy(xpath = "//input[@id='search']")
    public WebElement inputSearchBar;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement buttonActionSearch;

    @FindBy(xpath = "//a[contains(.,'Hera Pullover Hoodie')]")
    public WebElement wantedItem;

    @FindBy(id="option-label-size-143-item-167")
    public WebElement sizeBox;

    @FindBy(id= "option-label-color-93-item-50")
    WebElement colorBox;

    @FindBy(id="product-addtocart-button")
    WebElement addToCartButtonRemove;

    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement numberOfItemInCart;

    @FindBy(xpath = "//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")
    WebElement removeItemIcon;

    @FindBy(xpath = "/html/body/div[3]/aside[2]/div[2]/footer/button[2]")
    WebElement okRemoveItemButton;

    @FindBy(xpath = "//*[@id=\"minicart-content-wrapper\"]/div[2]/strong")
    WebElement removedItemResultText;

    public CombinedPage() {
        PageFactory.initElements(driver, this);
    }

    // AddModifyCartPage methods
    public void addToCartItem() {
        hoverOverElement(productItemLink);
        clickOnElement(addToCartButton);
        clickOnElement(addToCartButton);
    }

    public void modifyItem() {
        clickOnElement(cartButton);
        clearSendKeysToElement(modifyButton, "2");
        clickOnElement(updateButton);
    }

    public void removeCartItem() {
        clickOnElement(removeButton);
        clickOnElement(okButton);
    }

    // ModifyFromCartPage methods
    public void clickLoginLinkModify() {
        safeClickOnElement(loginLink);
    }

    public void setInputEmailModify(String validEmail){
        sendKeysToElement(inputEmail, validEmail);
    }

    public void setInputPasswordModify(String validPassword){
        sendKeysToElement(inputPassword, validPassword);
    }

    public void clickLoginButtonModify() {
        WebElement loginButton = null;
        safeClickOnElement(loginButton);
    }

    public void clickCartIconModify(){
        safeClickOnElement(cartIcon);
    }

    public void clickEditIconModify(){
        safeClickOnElement(editIcon);
    }

    public void clickOnMSizeBoxModify(){
        safeClickOnElement(sizeMBox);
    }

    public void clickOnUpdateCartModify(){
        safeClickOnElement(updateCartButton);
    }

    public WelcomeLoginPage getLogInModify(String validEmail, String validPassword){
        clickLoginLinkModify();
        setInputEmailModify(validEmail);
        setInputPasswordModify(validPassword);
        clickLoginButtonModify();
        return new WelcomeLoginPage();
    }

    // RemoveItemPage methods
    public void inputSearchTermRemove(String searchTerm){
        clearSendKeysToElement(inputSearchBar, searchTerm);
    }

    public void clickActionSearchButtonRemove(){
        safeClickOnElement(buttonActionSearch);
    }

    public void clickOnTheItemRemove(){
        safeClickOnElement(wantedItem);
    }

    public void selectYourSizeRemove(){
        safeClickOnElement(sizeBox);
    }

    public void selectAColorRemove(){
        safeClickOnElement(colorBox);
    }

    public void clickOnAddToCartButtonRemove(){
        safeClickOnElement(addToCartButtonRemove);
    }

    public void clickOnNumberOfItemInCartRemove(){
        safeClickOnElement(numberOfItemInCart);
    }

    public void clickOnRemoveItemIconRemove(){
        safeClickOnElement(removeItemIcon);
    }

    public void clickOnOkRemoveItemRemove(){
        safeClickOnElement(okRemoveItemButton);
    }

    public void removeItemFromCartRemove(String searchTerm) {
        inputSearchTermRemove(searchTerm);
        clickActionSearchButtonRemove();
        clickOnTheItemRemove();
        selectYourSizeRemove();
        selectAColorRemove();
        clickOnAddToCartButtonRemove();
        clickOnNumberOfItemInCartRemove();
        clickOnRemoveItemIconRemove();
        clickOnOkRemoveItemRemove();
    }
}
