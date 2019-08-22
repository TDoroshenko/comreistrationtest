package com.automation.practice.pages;

import model.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.id;


public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private void personalSelectGender(String gender) {
        if(gender.equals("Mr.")){
            driver.findElement(id("id_gender1")).click();
               } else {
            driver.findElement(id("id_gender2")).click();
        }
    }

    private void personalTypeFirstName(String firstName) {
        driver.findElement(id("customer_firstname")).sendKeys(firstName);
    }

    private void personalTypeLastName(String lastName) {
        driver.findElement(id("customer_lastname")).sendKeys(lastName);
    }

    private void personalTypeEmail(String email) {
        driver.findElement(id("email")).sendKeys(email);
    }

    private void personalTypePassword(String password) {
        driver.findElement(id("passwd")).sendKeys(password);
    }

    private void personalSetBirthdayDate(String date, String month, String year) {
        personalSelectBirthDay(date);
        personalSelectBirthMonth(month);
        personalSelectBirthYear(year);
    }

    private void personalSelectBirthDay(String date) {
        WebElement dayDropDown = driver.findElement(id("days"));
        Select value = new Select(dayDropDown);
        value.selectByValue(date);
    }

    private void personalSelectBirthMonth(String month) {
        WebElement monthDropDown = driver.findElement(id("months"));
        Select value = new Select(monthDropDown);
        value.selectByValue(month);
    }

    private void personalSelectBirthYear(String year) {
        WebElement yearDropDown = driver.findElement(id("years"));
        Select value = new Select(yearDropDown);
        value.selectByValue(year);
    }

    private void addressTypeFirstName(String addressFirstName) {
        driver.findElement(id("firstname")).sendKeys(addressFirstName);
    }

    private void addressTypeLastName(String addressLastName) {
        driver.findElement(id("lastname")).sendKeys(addressLastName);
    }

    private void addressTypeCompany(String company) {
        driver.findElement(id("company")).sendKeys(company);
    }

    private void addressTypeAddress(String address) {
        driver.findElement(id("address1")).sendKeys(address);
    }

    private void addressTypeAddressLine2(String addressLine2) {
        driver.findElement(id("address2")).sendKeys(addressLine2);
    }

    private void addressTypeCity(String city) {
        driver.findElement(id("city"));
    }

    private void addressSelectState(String state) {
        WebElement stateDropdown = driver.findElement(id("id_state"));
        Select value = new Select(stateDropdown);
        value.selectByValue(state);
    }

    private void addressTypePostalCode(String postcode) {
        driver.findElement(id("postcode")).sendKeys(postcode);
    }

    private void addressSelectCountry(String country) {
        WebElement countryDropdown = driver.findElement(id("id_country"));
        Select value = new Select(countryDropdown);
        value.selectByValue(country);
    }

    private void addressTypeAddInfo(String addInfo) {
        driver.findElement(id("other")).sendKeys(addInfo);
    }

    private void addressTypeHomePhone(String homePhone) {
        driver.findElement(id("phone")).sendKeys(homePhone);
    }

    private void addressTypeMobilePhone(String mobilePhone) {
        driver.findElement(id("phone_mobile")).sendKeys(mobilePhone);
    }

    private void addressTypeAlias(String alias) {
        driver.findElement(id("alias")).sendKeys(alias);
    }


    public void clickRegister() {
        WebElement element = driver.findElement(id("submitAccount"));
        element.click();
    }

    public MyAccountPage fillAndSubmitRegistrationForm(Account account) {
        this.fillRegistrationForm(account);
        this.clickRegister();
        return new MyAccountPage(driver);
    }

    private void fillRegistrationForm(Account account) {
        personalSelectGender(account.getGender());
        personalTypeFirstName(account.getFirstName());
        personalTypeLastName(account.getLastName());
        personalTypeEmail(account.getEmail());
        personalTypePassword(account.getPassword());
        personalSetBirthdayDate(account.getDate(), account.getMonth(), account.getYear());
        addressTypeFirstName(account.getAddressFirstName());
        addressTypeLastName(account.getAddressLastName());
        addressTypeCompany(account.getCompany());
        addressTypeAddress(account.getAddress());
        addressTypeAddressLine2(account.getAddressLine2());
        addressTypeCity(account.getCity());
        addressSelectState(account.getState());
        addressTypePostalCode(account.getPostcode());
        addressSelectCountry(account.getCountry());
        addressTypeAddInfo(account.getAddInfo());
        addressTypeHomePhone(account.getHomePhone());
        addressTypeMobilePhone(account.getMobilePhone());
        addressTypeAlias(account.getAlias());


    }

}
