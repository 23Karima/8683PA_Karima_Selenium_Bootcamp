package luma.pom.checkoutpage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class CheckoutPage extends BasePage {

        // Web Elements
        @FindBy(id="top-cart-btn-checkout")
        public WebElement checkOutButton;

        @FindBy(xpath = "//input[@id='VC41YIL']")
        public WebElement inputCompany;

        @FindBy(xpath = "//input[@id = 'B22XYI4']")
        public WebElement inputStreetAddress;

        @FindBy(xpath = "//input[@id='PMON5SM']")
        public WebElement inputCity;

        @FindBy(xpath = "//select[@class='select']")
        public WebElement stateProvinceDropdown;

        @FindBy(xpath = "//input[@id='HPF3581']")
        public WebElement inputZipField;

        @FindBy(xpath = "//select[@id='PKXG6NA']")
        public WebElement countryDropdown;

        @FindBy(xpath = "//input[@id='RR4GA7V']")
        public WebElement phoneNumberInput;

        @FindBy(xpath = "//[@id='checkout-shipping-method-load']/table/tbody/tr[1]/td[1]/input")
        public WebElement shippingMethodButton;

        @FindBy(xpath = "//[@id='shipping-method-buttons-container']/div/button")
        public WebElement nextButton;

        public CheckoutPage(){
            PageFactory.initElements(driver,this);
        }

        // Click on the Checkout Button
        public void clickOnCheckoutButton(){
            safeClickOnElement(checkOutButton);
        }

        // Input Company Name
        public void inputCompanyName(String companyName){
            sendKeysToElement(inputCompany, companyName);
        }

        // Input Street Address
        public void setInputStreetAddress(String streetAddress){
            sendKeysToElement(inputStreetAddress, streetAddress);
        }

        // Input City Name
        public void setInputCity(String cityName){
            sendKeysToElement(inputCity, cityName);
        }

        // Click on State/Province Dropdown
        public void clickStateProvinceDropdown(){
            safeClickOnElement(stateProvinceDropdown);
        }

        // Input Zip Field
        public void setInputZipField(String zipCode){
            sendKeysToElement(inputZipField, zipCode);
        }

        //  Methods for other fields and actions i can added here if i need it .

    }
