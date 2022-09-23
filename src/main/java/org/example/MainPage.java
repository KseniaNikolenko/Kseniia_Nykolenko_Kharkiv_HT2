package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameInputField = By.xpath("//input[@name='name']");
    private By mailInputField = By.xpath("//input[@name='email']");
    private By sendButton = By.xpath("//button[@class=\"button-reset main-btn main-btn--green\"]");
    private By singInIcon = By.xpath("//div[@class=\"header-bottom__right flex-wrap middle-xs end-xs\"]/a");
    private By tradeLink = By.xpath("//a[@class=\"header-top__item\"]");

    public SigninPage singInIcon(){
        driver.findElement(singInIcon).click();
        return new SigninPage(driver);
    }

    public TradeinPage clickTradeLink(){
        driver.findElement(tradeLink).click();
        return new TradeinPage(driver);
    }

    public MainPage fillUpName(String name) {
        driver.findElement(nameInputField).sendKeys(name);
        return this;
    }

    public MainPage fillUpMail(String email) {
        driver.findElement(mailInputField).sendKeys(email);
        return this;
    }

    public MainPage clickSend() {
        driver.findElement(sendButton).click();
        return this;
    }

    public MainPage knowSpecialPrice (String name, String email) {
        this.fillUpName(name);
        this.fillUpMail(email);
        this.clickSend();
        return this;
    }

}
