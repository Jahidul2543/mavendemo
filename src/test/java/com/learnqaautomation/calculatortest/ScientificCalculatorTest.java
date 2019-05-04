package com.learnqaautomation.calculatortest;

import com.learnqaautomation.calculator.ScientificCalcualtor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScientificCalculatorTest {

    @Test
    public void logTest() {
        ScientificCalcualtor obj = new ScientificCalcualtor();
        int actual = obj.addMethodInScientificCalculator(2, 3, 4);
        Assert.assertEquals(actual, 9);
    }
}
