package com.cydeo.tests;

import com.cydeo.utils.ConfigurationReader;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest extends WebTestBase {

    @Test
    public void etsySearchTest() throws InterruptedException {
        driver.get("https://www.etsy.com");
        //Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.name("search_query"));
        searchField.sendKeys("wooden spoon" + Keys.ENTER);
        //print number of results
        WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results,')]"));
        System.out.println("results.getText() = " + results.getText());
    }

    @Test
    public void loginTest() {
        String email = ConfigurationReader.getProperty("email");
        String password = ConfigurationReader.getProperty("password");

        WebElement signIn = driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
        signIn.click();

        WebElement userNameField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));;

        userNameField.sendKeys(email);
        passwordField.sendKeys(password + Keys.ENTER);

    }



}
