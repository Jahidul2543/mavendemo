package com.learnqaautomation.calculatortest;

import com.learnqaautomation.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {

       @Test  // By writing this you are saying addTest() is a test method
    public void addTest(){
        Calculator objCalculator = new Calculator();
        int actual = objCalculator.add(2,3);

        // check 2+3=5 or not. if it is five say test passes, if it other than 5 say test failed
         Assert.assertEquals(actual, 5);

          System.out.println("Test Passed");

    }

    @Test
    public void  deductTest(){
        Calculator objCalculator = new Calculator();
        int actual =  objCalculator.deduct(5,3);
        Assert.assertEquals(actual, 2);
    }

}
