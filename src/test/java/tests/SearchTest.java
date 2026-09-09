package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test(description = "Verify product search returns results")
    public void verifyProductSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Laptop");

        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        Assert.assertTrue(resultsPage.areResultsDisplayed(), "No search results were displayed");
        Assert.assertTrue(resultsPage.getResultCount() > 0, "Search result count should be greater than zero");
    }
}
