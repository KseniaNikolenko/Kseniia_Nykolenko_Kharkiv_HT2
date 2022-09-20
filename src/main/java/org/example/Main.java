package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nykolenko.k\\IdeaProjects\\Kseniia_Nykolenko_Kharkiv_HT2\\drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://avic.ua/ua");
        WebElement link = driver.findElement(By.linkText("Обмінюй старий гаджет на новий Trade-in"));
        WebElement link2 = driver.findElement(By.partialLinkText("IR2015MWH"));
        WebElement e3 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/div/div/button/svg/path"));


        /* driver.manage().window().setSize(new Dimension(900, 500));
        driver.get("https://avic.ua/ua");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/
        driver.quit();
    }
}