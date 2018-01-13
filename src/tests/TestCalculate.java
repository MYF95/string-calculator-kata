package tests;

import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCalculate {
    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void emptyStringReturnsZero(){
        Assert.assertEquals(calculator.calculate(""), 0);
    }

    @Test
    public void singleValueIsReplied() {
        Assert.assertEquals(calculator.calculate("1"), 1);
    }

    @Test
    public void twoNumbersCommaDelimitedReturnSum(){
        Assert.assertEquals(calculator.calculate("1,2"),3);
    }

    @Test
    public void twoNumbersNewLineDelimitedReturnSum(){
        Assert.assertEquals(calculator.calculate("1\n2"),3);
    }
}
