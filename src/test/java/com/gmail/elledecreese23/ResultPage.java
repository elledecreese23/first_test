package com.gmail.elledecreese23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class ResultPage {

    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    @FindBy(css ="a[accesskey=\"1\"]")
    private WebElement resultButton;


    public void ResultButton() {
        resultButton.click();
    }
}
