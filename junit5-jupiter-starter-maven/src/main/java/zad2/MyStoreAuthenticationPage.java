package zad2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAuthenticationPage {
    @FindBy(css = "href#log.in.to.your.customer.account")
    private WebElement signIn;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-login")
    private WebElement signInButton;
    private WebDriver driver;


    public MyStoreAuthenticationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void submitSignIn(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        signInButton.click();
    }

}
