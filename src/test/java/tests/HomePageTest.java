package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test(description = "Verify Flipkart homepage loads successfully")
    public void verifyHomePageTitle() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isHomePageLoaded(), "Flipkart homepage did not load correctly");
    }
}
