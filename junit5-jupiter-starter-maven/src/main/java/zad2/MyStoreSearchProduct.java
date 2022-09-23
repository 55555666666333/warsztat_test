package zad2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import zad1.AddressData;

public class MyStoreSearchProduct {
    private WebDriver driver;

    public MyStoreSearchProduct(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(ProductData ProductData) {
        clickSearchOurCatalog();
        WebElement SweaterInput = driver.findElement(By.cssSelector("src#https://mystore-testlab.coderslab.pl/img/p/2/1/21-home_default.jpg"));
        SweaterInput.sendKeys(ProductData.getSweater());

    }

    public void clickSearchOurCatalog() {
        WebElement clickSearchOurCatalogLink = this.driver.findElement(
                By.cssSelector("class#material-icons.search")
        );
        clickSearchOurCatalogLink.click();
    }
}
