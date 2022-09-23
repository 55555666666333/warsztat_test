package zad2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    private WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout() {
        this.driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=order");

        this.driver.findElement(By.name("confirm-addresses")).click();
        this.driver.findElement(By.name("confirmDeliveryOption")).click();
        this.driver.findElement(By.id("payment-option-1")).click();
        this.driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();

        WebElement buttonDiv = this.driver.findElement(By.id("payment-confirmation"));
        buttonDiv.findElement(By.tagName("button")).click();
    }
}
