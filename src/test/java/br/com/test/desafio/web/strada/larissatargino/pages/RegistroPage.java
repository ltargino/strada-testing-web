package br.com.test.desafio.web.strada.larissatargino.pages;

import br.com.test.desafio.web.strada.larissatargino.model.enums.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistroPage extends BasePage{

    private final By nameField = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
    private final By lastNameField = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
    private final By addressField = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
    private final By emailField = By.xpath("//*[@id=\"eid\"]/input");
    private final By phoneField = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
    private final By passwordField = By.xpath("//*[@id=\"firstpassword\"]");
    private final By confirmPasswordField = By.xpath("//*[@id=\"secondpassword\"]");

    private final By radioMale = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
    private final By radioFemale = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");

    private final By cricketCheck = By.id("checkbox1");
    private final By moviesCheck = By.id("checkbox2");
    private final By hockeyCheck = By.id("checkbox3");

    private final By skillsCombobox = By.id("Skills");

    private final By dayCombobox = By.id("daybox");
    private final By monthCombobox = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
    private final By yearCombobox = By.id("yearbox");

    private final By countryCombobox = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
    private final By countryField = By.xpath("/html/body/span/span/span[1]/input");

    private final By languagesField = By.id("msdd");

    private final By submmitButton = By.id("submitbtn");

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

    public void goToRegistroPage() {
        this.driver.get("https://demo.automationtesting.in/Register.html");
    }

    public void fillName(String name) {
        this.driver.findElement(nameField).sendKeys(name);
    }

    public void fillLastName(String lastName) {
        this.driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillAddress(String address) {
        this.driver.findElement(addressField).sendKeys(address);
    }

    public void fillEmailAddress(String email) {
        this.driver.findElement(emailField).sendKeys(email);
    }

    public void fillPhone(String number) {
        this.driver.findElement(phoneField).sendKeys(number);
    }

    public void fillPassword(String password) {
        this.driver.findElement(passwordField).sendKeys(password);
    }

    public void fillConfirmPassword(String confirmPassword) {
        this.driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void finishRegister()  {


        ((JavascriptExecutor)this.driver).executeScript("arguments[0].scrollIntoViewIfNeeded()", driver.findElement(submmitButton));
        this.waiter.until(ExpectedConditions.elementToBeClickable(driver.findElement(submmitButton)));



        this.driver.findElement(submmitButton).click();
    }

    public void fillGender(Gender gender) {
        switch (gender) {
            case Male:
                WebElement radioMaleElement = this.driver.findElement(radioMale);
                this.waiter.until(ExpectedConditions.elementToBeClickable(radioMaleElement));
                radioMaleElement.click();
                return;
            case Female:
                WebElement radioFemaleElement = this.driver.findElement(radioFemale);
                this.waiter.until(ExpectedConditions.elementToBeClickable(radioFemaleElement));
                radioFemaleElement.click();
                return;
        }
    }

    public void fillHobbies(Hobbies... hobbies) {
        for (Hobbies hobbie: hobbies) {
            switch (hobbie) {
                case Cricket:
                    WebElement cricketCheckElement = this.driver.findElement(cricketCheck);
                    this.waiter.until(ExpectedConditions.elementToBeClickable(cricketCheckElement));
                    cricketCheckElement.click();
                    return;
                case Movies:
                    WebElement moviesCheckElement = this.driver.findElement(moviesCheck);
                    this.waiter.until(ExpectedConditions.elementToBeClickable(moviesCheckElement));
                    moviesCheckElement.click();
                    return;
                case Hockey:
                    WebElement hockeyCheckElement = this.driver.findElement(hockeyCheck);
                    this.waiter.until(ExpectedConditions.elementToBeClickable(hockeyCheckElement));
                    hockeyCheckElement.click();
                    return;
            }
        }
    }

    public void fillSkills(Skills skills) {
        this.driver.findElement(skillsCombobox).sendKeys(skills.toString());
    }

    public void fillDateOfBrith(String day, int month, String year) {
        this.driver.findElement(dayCombobox).sendKeys(day);
        this.driver.findElement(monthCombobox).sendKeys(Meses.values()[month-1].toString());
        this.driver.findElement(yearCombobox).sendKeys(year);
    }

    public void fillCountry(Country country) {
        this.driver.findElement(countryCombobox).click();
        this.driver.findElement(countryField).sendKeys(country.toString());
        this.driver.findElement(countryField).sendKeys(Keys.ENTER);
    }

    public void fillLanguages(Languages languages) {
        this.driver.findElement(languagesField).click();

        //*[@id="basicBootstrapForm"]/div[7]/div/multi-select/div[2]/ul/li[29]/a
    }
}
