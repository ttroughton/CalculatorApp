package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    //fields
    private BigDecimal num1;
    private BigDecimal num2;
    //getters and setters
    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }
    //Constructor
    public Calculator(){}
    //Methods
    public void addNums (BigDecimal num1, BigDecimal num2){
        setNum1(num1.add(num2));
    }

    public void subtractNums (BigDecimal num1, BigDecimal num2){
        setNum1(num1.subtract(num2));
    }

    public void multiplyNums(BigDecimal num1, BigDecimal num2){
        setNum1(num1.multiply(num2));
    }

    public void divideNums(BigDecimal num1, BigDecimal num2){
        setNum1(num1.divide(num2, 4, RoundingMode.DOWN));
    }
}
