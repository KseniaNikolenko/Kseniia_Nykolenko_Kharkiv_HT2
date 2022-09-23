package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nykolenko.k\\IdeaProjects\\Kseniia_Nykolenko_Kharkiv_HT2\\drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.of(10, TimeUnit.SECONDS.toChronoUnit()));
        driver.get("https://avic.ua/ua");

        WebElement link = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/header/div[2]/div/div[4]/a[1]"));
        link.click();
        driver.findElement(By.xpath("//input[@class=\"validate\"]")).sendKeys("+0951099819");
        driver.findElement(By.xpath("//input[@class=\"validate show-password\"]")).sendKeys("ncsknaml");
        driver.findElement(By.xpath("//i[@class=\"icon icon-eye\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//i[@class=\"icon icon-eye-blocked\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"validate show-password\"]")).clear();


     //   driver.findElement(By.xpath("//a[@class=\"fancybox\"]")).click();


        /*driver.findElement(By.xpath("//input[@id=\"input_search\"]")).sendKeys("eBook");
        WebElement button = driver.findElement(By.xpath("//button[@class=\"button-reset search-btn\"]"));
        button.click();
        driver.findElement(By.xpath("//input[@id=\"input_search\"]")).clear();*/


        /*WebElement link = driver.findElement(By.linkText("Обмінюй старий гаджет на новий Trade-in"));
        WebElement link2 = driver.findElement(By.partialLinkText("IR2015MWH"));
        WebElement e3 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/div/div/button/svg/path"));*/


        /* driver.manage().window().setSize(new Dimension(900, 500));
        driver.get("https://avic.ua/ua");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();*/
    }
}