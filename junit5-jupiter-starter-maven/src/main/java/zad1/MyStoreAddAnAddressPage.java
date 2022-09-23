package zad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyStoreAddAnAddressPage {
    private WebDriver driver;

    public MyStoreAddAnAddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addAnAddress(AddressData AddressData) {
        clickAddAnAddress();
        WebElement AddressInput = driver.findElement(By.name("address1"));
        AddressInput.sendKeys(AddressData.getAddress());
        WebElement CityInput = driver.findElement(By.name("city"));
        CityInput.sendKeys(AddressData.getCity());
        WebElement ZipInput = driver.findElement(By.name("postcode"));
        System.out.println("+++++++++");
        System.out.println(AddressData.getZip());
        System.out.println("=========");
        ZipInput.sendKeys(AddressData.getZip());

       WebElement temp = this.driver.findElement(
                By.xpath("//input[@name='submitAddress']")
       );
        WebElement saveButton = this.driver.findElement(
//                By.name("submitAddress")
                By.xpath("//input[@name='submitAddress']/following-sibling::button[@type='submit']")
        );
//        saveButton.click();
        saveButton.submit();
    }

    public void clickAddAnAddress() {
        WebElement createNewAddressLink = this.driver.findElement(
                By.xpath("//a/span[text()='Create new address']")
        );
        createNewAddressLink.click();
    }
}
