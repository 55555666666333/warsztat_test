package com.example.project;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import zad1.MyStoreAuthenticationPage;
import zad1.MyStoreMainPage;
import zad2.*;
import java.time.Duration;

public class MyStoreTest2 {
    public WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void StoreTest2() {
        MyStoreMainPage MyStoreMainPage = new MyStoreMainPage(driver);
        MyStoreMainPage.clickSignIn();

        MyStoreAuthenticationPage authenticationPage = new MyStoreAuthenticationPage(driver);
        String email = "oetuomldfaacfducoz@bvhrk.com";
        String password = "1992Dawid";
        authenticationPage.submitSignIn(email, password);

        new WebDriverWait(driver, Duration.ofSeconds(4));

        MyStoreProductAuthenticationPage productAuthenticationPage = new MyStoreProductAuthenticationPage(driver);
        productAuthenticationPage.searchProduct();

        new WebDriverWait(driver, Duration.ofSeconds(4));

        SearchPage searchPage = new SearchPage(driver);
        searchPage.findProductFromSearch();

        new WebDriverWait(driver, Duration.ofSeconds(4));

        AddProductToCartPage addProductToCartPage = new AddProductToCartPage(driver);
        addProductToCartPage.addToCart();

        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.checkout();

        Screenshot screenshot = new Screenshot(driver);
        screenshot.takeScreenshot();
    }

    @And("Quit browser")
    public void quitBrowser() {
        driver.quit();
    }
}
