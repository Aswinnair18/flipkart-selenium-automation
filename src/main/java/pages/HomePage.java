package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final By searchBox = By.name("q");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isHomePageLoaded() {
        return driver.getTitle().toLowerCase().contains("flipkart");
    }

    public void searchProduct(String product) {
        WebElement search = driver.findElement(searchBox);
        search.clear();
        search.sendKeys(product);
        search.submit();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
