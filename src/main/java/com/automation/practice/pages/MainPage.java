package com.automation.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage{

    private static final String URL = "http://automationpractice.com";
    private WebDriver driver;
    private By signInButton = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage openMainPage() {
        this.driver.navigate().to(URL);
        return this;
    }

    public MainPage openRegistration(){
        this.driver.navigate().to(URL);
        this.driver.findElement(signInButton).click();
        return this;
    }


}
