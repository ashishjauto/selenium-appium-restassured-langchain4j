package com.web.test;

import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Epic("E-Commerce")
@Feature("Login Feature")
public class LoginTest {
/*
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test(description = "Verify valid login")
    @Severity(SeverityLevel.CRITICAL)
    @Story("User logs in with valid credentials")
    public void testLogin() {

        openApplication();
        enterCredentials("testuser", "password123");
        clickLogin();

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @Step("Open application URL")
    public void openApplication() {
        driver.get("https://example.com");
    }

    @Step("Enter username: {0} and password")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Step("Click login button")
    public void clickLogin() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }*/
}