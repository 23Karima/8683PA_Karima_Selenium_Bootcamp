
import base.BasePage;
import luma.pom.CreateAccount;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelData;
public class CreateAccountWithDataProvider extends BasePage{

        @Test(priority = 5, groups = {"BAT"},dataProvider = "datacreateaccount")
        public void testCreateAccountUsingDataProvider(String fName,String lName,String emailId,String pass) {
            CreateAccount createAccount = new CreateAccount();
            createAccount.createAccountWithParam(fName, lName, emailId, pass);

            Assert.assertTrue(isElementVisible(createAccount.registeruservalidation));
        }

        @DataProvider(name="datacreateaccount")
        public String[][] createAccountDataProvider()
        {
            String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data.xlsx";
            ExcelData ex=new ExcelData(path);
            String data[][]=ex.readStringArrays("CreateLumaAccount");
            return data;
        }

    }
