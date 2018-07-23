package com.gmail.elledecreese23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class SearchPage {
    private By searchField = By.id("text");
    private By searchButton = By.cssSelector(".search2__button button");
    private final WebDriver driver;


    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    public void inputSearch(String text){
        driver.findElement(searchField).sendKeys(text);
        driver.findElement(searchButton).click();
    }
}
