package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
    private final WebDriver driver;
    private final By productCards = By.xpath("//div[contains(@class,'_1AtVbE')]");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean areResultsDisplayed() {
        return driver.findElements(productCards).size() > 0;
    }

    public int getResultCount() {
        return driver.findElements(productCards).size();
    }
}
