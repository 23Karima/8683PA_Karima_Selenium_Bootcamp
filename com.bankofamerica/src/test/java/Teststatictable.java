
import base.BasePage;
import bankofamerica.pom.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Teststatictable extends BasePage {
    @Test
    public void testStaticTable() {
        // Verify the table is displayed
        HomePage homePage = new HomePage();
        Assert.assertTrue(isElementVisible(homePage.tableForBoa));

        // Verify the number of rows in the table
        int expectedRowCount = 1; // Set the expected row count
        Assert.assertEquals(expectedRowCount, homePage.getRowCount());

        // Iterate through each row and verify the number of cells
        int rowIndex = 1; // Start from the first row
        int expectedCellCount = 1; //
    }
}