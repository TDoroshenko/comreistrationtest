package com.automation.practice.pages.attributes;

import com.automation.practice.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountAttribute {

    private WebDriver driver;
    private WebElement emailField;
    private WebElement createAccountButton;

    private WebElement waitOnElement(String xpath) {
        return (new WebDriverWait(driver, 30)).until(
                ExpectedConditions.elementToBeClickable(By.xpath(xpath))
        );
    }

    public CreateAccountAttribute(WebDriver driver) {
        this.driver = driver;
    }

    public CreateAccountAttribute typeEmail(String email) {
        emailField = waitOnElement("//*[@id='email_create']");
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage clickCreateAnAccount(){
        createAccountButton = waitOnElement("//*[@id='SubmitCreate']");
        createAccountButton.click();
        return new RegistrationPage(driver);
    }


}
