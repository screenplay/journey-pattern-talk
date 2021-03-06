package com.riverglide.journeypatterntalk.seleniumpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindOwnersPage {

    @FindBy(css="#search-owner-form button")
    private WebElement searchButton;
    private WebDriver driver;

    public FindOwnersPage(WebDriver driver) {
        this.driver = driver;
    }

    public OwnersPage findAllOwners() {
        searchButton.click();
        return PageFactory.initElements(driver, OwnersPage.class);
    }
}
