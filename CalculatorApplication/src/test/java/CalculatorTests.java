import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTests {
    @Test
    public void addNums_num1_plus_num2_should_return_the_sum_of_the_two_nums(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal testNum1 = new BigDecimal(1);
        BigDecimal testNum2 = new BigDecimal(1);
        BigDecimal expected = new BigDecimal(2);
        //Act
        calculator.addNums(testNum1, testNum2);
        //Assert
        Assert.assertEquals("Did not return correct sum", expected, calculator.getNum1());
    }
    @Test
    public void subtractNums_num1_minus_num2_should_return_the_difference_of_the_two_nums(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal testNum1 = new BigDecimal(3);
        BigDecimal testNum2 = new BigDecimal(0.5);
        BigDecimal expected = new BigDecimal(2.5);
        //Act
        calculator.subtractNums(testNum1, testNum2);
        //Assert
        Assert.assertEquals("Did not return correct difference", expected, calculator.getNum1());
    }
    @Test
    public void multiplyNums_num1_times_num2_should_return_the_product_of_the_two_nums(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal testNum1 = new BigDecimal(5);
        BigDecimal testNum2 = new BigDecimal(6);
        BigDecimal expected = new BigDecimal(30);
        //Act
        calculator.multiplyNums(testNum1, testNum2);
        //Assert
        Assert.assertEquals("Did not return correct product", expected, calculator.getNum1());
    }
    @Test
    public void divideNums_num1_divided_by_num2_should_return_the_quotient_of_the_two_nums(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal testNum1 = new BigDecimal(4.5);
        BigDecimal testNum2 = new BigDecimal(2);
        BigDecimal expected = new BigDecimal(2.25);
        //Act
        calculator.divideNums(testNum1, testNum2);
        //Assert
        Assert.assertEquals("Did not return correct quotient", expected, calculator.getNum1());
    }
    @Test
    public void setNum1_setter_changes_value_of_num1(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal bd = new BigDecimal(1);
        BigDecimal expected = new BigDecimal(1);
       //Act
        calculator.setNum1(bd);
        //Assert
        Assert.assertEquals("Did not update field", expected, calculator.getNum1());
    }
    @Test
    public void setNum2_setter_changes_value_of_num2(){
        //Arrange
        Calculator calculator = new Calculator();
        BigDecimal bd = new BigDecimal(5.5);
        BigDecimal expected = new BigDecimal(5.5);
        //Act
        calculator.setNum2(bd);
        //Assert
        Assert.assertEquals("Did not update field", expected, calculator.getNum2());

    }
}
