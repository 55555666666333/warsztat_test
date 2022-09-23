package zad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreMainPage {
    private WebDriver driver;

    public MyStoreMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        WebElement signIn = this.driver.findElement(
                By.xpath("//a[@title='Log in to your customer account']")
        );
        signIn.click();
    }
}
