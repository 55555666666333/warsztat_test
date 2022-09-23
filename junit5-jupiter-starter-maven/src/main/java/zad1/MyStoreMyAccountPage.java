package zad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreMyAccountPage {
    public WebDriver driver;

    public MyStoreMyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isAddressSuccessfullyAdded() {
        WebElement confirmationPanel = this.driver.findElement(
                By.cssSelector("article.alert.alert-success")
        );
        String panelText = confirmationPanel.getText();

       return panelText.equals("Address successfully added!");
    }
}
