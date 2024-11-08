package br.com.test.desafio.web.strada.larissatargino.tests;

import br.com.test.desafio.web.strada.larissatargino.utils.DriverFactory;
import br.com.test.desafio.web.strada.larissatargino.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.goToLoginPage();

        loginPage.enterEmail("l.targino@hotmail.com");
        loginPage.clickLoginButton();

        Assertions.assertTrue(loginPage.isLoginSuccessful(), "Register");

        loginPage.close();
    }

}
