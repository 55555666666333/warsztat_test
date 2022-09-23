package zad2;

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
//                By.cssSelector("href#log.in.to.your.customer.account")
//                By.cssSelector("a[href='https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account']")
                By.xpath("//a[@title='Log in to your customer account']")
        );
        signIn.click();
    }
}
