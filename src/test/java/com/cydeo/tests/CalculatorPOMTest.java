package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    /**
     * 5 * 8 = 40
     */
    @Test
    public void multiplyTest() {
        calculatorPage.clickSingleDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickSingleDigit(8);

    }

}
