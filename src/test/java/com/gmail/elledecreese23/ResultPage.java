package com.gmail.elledecreese23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



    public class ResultPage {

    private By firststring = By.cssSelector("a[accesskey='1']");
    private final WebDriver driver;

    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public String getResult (){
        return driver.findElement(firststring).getText();
    }
}
