package br.com.test.desafio.web.strada.larissatargino.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By emailField = By.id("email");
    private final By loginButton = By.id("enterimg");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        this.driver.findElement(emailField).sendKeys(email);
    }

    public void clickLoginButton() {
        this.driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return this.driver.getCurrentUrl().contains("Register");
    }

    public void goToLoginPage() {
        this.driver.get("https://demo.automationtesting.in/Index.html");
    }

}
