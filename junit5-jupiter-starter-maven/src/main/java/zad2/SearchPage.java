package zad2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    private WebDriver driver;

    @FindBy(id = "js-product-list")
    private WebElement productLists;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void findProductFromSearch() {
        List<WebElement> products = productLists.findElements(By.tagName("a"));
        products.get(0).click();
    }
}
