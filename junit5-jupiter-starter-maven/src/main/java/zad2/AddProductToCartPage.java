package zad2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddProductToCartPage {
    private WebDriver driver;

    @FindBy(id = "group_1")
    private WebElement sizeElement;

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    public AddProductToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        Select sizeSelect = new Select(sizeElement);
        sizeSelect.selectByVisibleText("M");

        quantity.clear();
        quantity.sendKeys("5" + Keys.ENTER);
    }
}
