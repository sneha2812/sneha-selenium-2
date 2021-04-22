package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        // Creating a driver object referencing WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Launch google
        driver.get("http://www.fb.com");

        WebElement fbCookieBox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]"));
        fbCookieBox.click();

        WebElement acceptCookies = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button"));
        acceptCookies.click();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("email@email.com");
        email.clear();

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("password");
    }
}
