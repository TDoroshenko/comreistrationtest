package com.automation.practice.tests.pages;

import com.automation.practice.pages.MainPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private MainPage mainPage;
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\tdoroshenko\\IdeaProjects\\comsiteregistrationtest\\src\\test\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.mainPage = new MainPage(driver);
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testCanOpenMainPage() {
        this.mainPage.openMainPage();
    }


    @Test
    public void testCanOpenSinInPage() {
        this.mainPage.openMainPage();
        this.mainPage.openRegistration();
    }

//    @Test
//    public void canFillInRegistrationForm(){
//        this.mainPage.openMainPage();
//        this.mainPage.openRegistration();
//    }
//    @After
//    public void cleanup() {
//        driver.close();
   // }
}

