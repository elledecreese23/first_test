package com.gmail.elledecreese23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
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
    @AfterClass
    public static void tearDown (){
    driver.quit();
    }
}



