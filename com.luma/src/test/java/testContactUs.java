
import luma.pom.contactuspage.ContactUsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testContactUs extends BasePage {

    @Test(priority = 12 , groups = {"BAT"})
    public void testContactUs(){
        ContactUsPage contactUsPage= new ContactUsPage();
        String name= "karima";
        String email="karima21ait@gmail.com";
        String phoneNumber= "3474167592";
        String comment= "Our teacher is the best";
        contactUsPage.doContactUs(name,email,phoneNumber,comment);

        Assert.assertTrue(isElementVisible(contactUsPage.thankYouForContactingUsMessage));
    }
}

