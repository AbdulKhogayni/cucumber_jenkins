package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GooglePage extends BaseTest{
    @FindBy(name = "q")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='OBMEnb']//ul/li")
    public List<WebElement> searchResult;

    public void searchResultList(List<WebElement> searchValues, String value) {
        System.out.println("Total size: " + searchValues.size());
        for (WebElement searchValue : searchValues) {
            String listItems = searchValue.getText();
            if (listItems.contains(value)) {
                searchValue.click();
                break;
            }
        }
    }
}
