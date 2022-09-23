package zad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressesPage {

    private WebDriver driver;

    public MyAddressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddresses() {
        WebElement addressesLink = this.driver.findElement(
                By.xpath("//a[@id='addresses-link']")
        );
        addressesLink.click();
    }
}
