package com.gmail.elledecreese23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class SearchPage {

    public SearchPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(id = "text")
    private WebElement searchfield;

    @FindBy(css = ".search2__button button")
    private WebElement searchbutton;

    public void inputSearch(String Погода_в_Пензе) {
        searchfield.sendKeys(Погода_в_Пензе);

    }
    public void SearchButton() {
        searchbutton.click();
    }

}
