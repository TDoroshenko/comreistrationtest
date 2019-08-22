package com.automation.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

    private WebDriver driver;


    public SignIn(WebDriver driver) {
        this.driver = driver;
    }
//
//    public SignIn enterEmailAddressField(){
//        this.driver.findElement(By.xpath("//*[@id='email_create']")).click();
//        return this;
//    }


    public SignIn enterEmailinEmailAddressField(String email){
        this.driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys(email);
        return  this;
    }
}
