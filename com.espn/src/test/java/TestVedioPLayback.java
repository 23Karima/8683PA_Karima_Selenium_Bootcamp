
import base.BasePage;
import espn.pom.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

    // Test class for testing video playback functionality
    public class TestVedioPLayback extends BasePage {

        // Test Case: Test the video playback functionality
        @Test(priority = 4, groups = {"BAT"})
        public void TestVedioPLayback() {
            // Initialize HomePage
            HomePage homePage = new HomePage();

            // Perform video playback actions (play, pause, mute)
            homePage.doPlayVideo();

            // Add assertion here to verify that video playback works correctly
            // For example, you can assert that the video controls are visible and responsive
            // Assert.assertTrue(...);
        }
    }


