package com.cydeo.tests;

import org.junit.jupiter.api.Test;

public class EtsyChromeTest extends WebTestBase {

    @Test
    public void etsySearchTest() throws InterruptedException {
        driver.get("https://www.etsy.com");
        Thread.sleep(3000);
    }

}
