import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Database;

import java.sql.SQLException;

public class Testsql extends BasePage {

    @Test
    public void testCreateCompany() throws SQLException {
        // Test method to verify the creation of a company using SQL database

        // SQL query to check the count of companies with name 'Tesla'
        String query = "SELECT COUNT(*) FROM COMPANIES WHERE NAME = 'Tesla'";

        // Initialize the database connection
        databaseInit();

        // Execute the SQL query and retrieve the result
        Object result = db.executeQueryReadOne(query);

        // Verify if the count of companies with name 'Tesla' is 1
        Assert.assertTrue(result.toString().equals("1"),
                "The count of companies with name 'Tesla' is not equal to 1.");
    }
}
