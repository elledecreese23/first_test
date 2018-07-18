package com.gmail.elledecreese23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class First_Test {
    public static WebDriver driver;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edelweis\\IdeaProjects\\first_test\\chromedriver.exe");
        driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://yandex.ru");
    }
    @Test
    public void firstTest(){

        WebElement searchfield = driver.findElement(By.id("text"));
        searchfield.sendKeys("Погода в пензе");
        WebElement searchbutton = driver.findElement(By.cssSelector(".search2__button button"));
        searchbutton.click();
        WebElement firststring = driver.findElement(By.cssSelector("a[accesskey='1']"));
        String pogoda = firststring.getText();
        Assert.assertEquals("Погода в Пензе", pogoda);
    }
    @AfterClass
    public static void end(){
        driver.quit();
    }
}
