package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TradeinPage {
    private WebDriver driver;

    public TradeinPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nextStep = By.xpath("//button[@class=\"main-btn main-btn--green btn-tradein-fullwidth-small\"]");
    private By previewStep = By.xpath("//button[@class=\"main-btn main-btn--orange btn-tradein-fullwidth-small\"]");
    private By nameField = By.xpath("//input[@data-bind=\"name\"]");
    private By phoneField = By.xpath("//input[@data-bind=\"phone\"]");
    private By sendButton = By.xpath("//button[@class=\"main-btn main-btn--green btn-tradein-fullwidth-small\"]");
    private By assentbutton = By.xpath("//button[text()='Так']");
    private By goodConditionButton = By.xpath("//button[text()='Дисплей та корпус не має подряпин і відколів']");
    private By fullSet = By.xpath("//button[text()='Повний комплект']");
    private By model = By.xpath("//p[text()='Смартфон Apple iPhone 6s 32GB Rose Gold (MN122)']");

    public TradeinPage nextStepClick () {
        driver.findElement(nextStep).click();
        return this;
    }

    public TradeinPage previewStepClick () {
        driver.findElement(previewStep).click();
        return this;
    }

    public TradeinPage fillnameField(String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public TradeinPage fillPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public TradeinPage sendClick() {
        driver.findElement(sendButton).click();
        return this;
    }

    public TradeinPage assentClick () {
        driver.findElement(assentbutton).click();
        return this;
    }

    public TradeinPage goofCondition () {
        driver.findElement(goodConditionButton).click();
        return this;
    }

    public String fullSetCheck () {
        return driver.findElement(fullSet).getText();
    }

    public String modelCheck() {
        return driver.findElement(model).getText();
    }

    public TradeinPage fillForm (String name, String phone) {
        this.fillnameField(name);
        this.fillPhoneField(phone);
        this.sendClick();
        return this;

    }


}
