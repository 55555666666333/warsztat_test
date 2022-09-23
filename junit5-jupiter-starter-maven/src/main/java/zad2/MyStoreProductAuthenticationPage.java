package zad2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreProductAuthenticationPage {
    private WebDriver driver;

    @FindBy(id = "search_widget")
    private WebElement searchForm;

    public MyStoreProductAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchProduct() {
        WebElement searchInput = searchForm.findElement(By.className("ui-autocomplete-input"));

        searchInput.sendKeys("Hummingbird printed sweater" + Keys.ENTER);
    }
}

