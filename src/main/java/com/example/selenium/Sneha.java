package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sneha {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        // Launch Yahoo
        webDriver.get("http://www.yahoo.com");

        WebElement yahooCookie = webDriver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/div[2]/a"));
        yahooCookie.click();
    }
}
