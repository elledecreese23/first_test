package com.gmail.elledecreese23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest(){
        searchPage = new SearchPage(driver);
        resultPage = new ResultPage(driver);
        searchPage.inputSearch("Погода в Пензе");
        String weather = resultPage.getResult();
        Assert.assertEquals("Погода в Пензе", weather );

    }
}

