package com.example.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zad1.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStoreTest {
    public WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        this.driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void StoreTest() {
        MyStoreMainPage MyStoreMainPage = new MyStoreMainPage(driver);
        MyStoreMainPage.clickSignIn();

        MyStoreAuthenticationPage authenticationPage = new MyStoreAuthenticationPage(driver);
        String email =  "oetuomldfaacfducoz@bvhrk.com";
        String password = "1992Dawid";
        authenticationPage.submitSignIn(email , password);

        // click addressses:
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        myAddressesPage.clickAddresses();

        MyStoreAddAnAddressPage AddAnAddress = new MyStoreAddAnAddressPage(driver);
        AddressData AddressData = new AddressData()
                .setAddress("Ul.Pulawska")
                .setZip("02-508")
                .setCity("Warszawa");

        AddAnAddress.addAnAddress(AddressData);

        MyStoreMyAccountPage myAccountPage = new MyStoreMyAccountPage(driver);
        assertTrue(myAccountPage.isAddressSuccessfullyAdded());
    }
}
