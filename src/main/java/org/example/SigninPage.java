package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

    private WebDriver driver;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
    }

    private By loginField = By.xpath("//input[@name=\"login\"]");
    private By passField = By.xpath("//input[@name=\"password\"]");
    private By signInButton = By.xpath("//button[@class=\"button-reset main-btn submit main-btn--green\"]");
    private By forgotPassword = By.xpath("//a[@class=\"btn-password fancybox\"]");

    private By errorText = By.xpath("//div[@class=\"col-xs-12 js_message\"]");

    public SigninPage loginFillUp (String login) {
        driver.findElement(loginField).sendKeys(login);
        return this;
    }

    public SigninPage passFillUp (String password) {
        driver.findElement(passField).sendKeys(password);
        return this;
    }

    public SigninPage clickSignIn () {
        driver.findElement(signInButton).click();
        return this;
    }

    public SigninPage clickForgotPass () {
        driver.findElement(forgotPassword).click();
        return this;
    }

    public SigninPage SignInToAcc (String login, String password) {
        this.loginFillUp(login);
        this.passFillUp(password);
        this.clickSignIn();
        return this;
    }

    public String ErrorLoginMessage () {
        return driver.findElement(errorText).getText();
    }

}
