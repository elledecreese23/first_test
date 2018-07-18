package com.gmail.elledecreese23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest {
    public static WebDriver driver;
    public static SearchPage searchPage;
    public static ResultPage resultPage;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\edelweis\\IdeaProjects\\first_test\\chromedriver.exe");
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        resultPage = new ResultPage(driver);
        driver.manage().window().maximize();
        driver.get("https://yandex.ru");
    }
    @Test
    public void searchTest(){
        searchPage.inputSearch("Погода в Пензе");
        searchPage.SearchButton();
        resultPage.ResultButton();
    }
}

