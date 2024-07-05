package org.example;


import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Display display = new Display();
        boolean isOn = true;

        display.mainMenu();
        //User enters first number
        BigDecimal input = new BigDecimal(userInput.nextLine());
        calc.setNum1(input);

        while (isOn){
            display.promptForOperator();
            //User chooses operation
            String op = userInput.nextLine();
            if (op.equalsIgnoreCase("off")){
                isOn = false;
                continue;
            }
            display.promptForNumber();
            //User enters second number
            try {
                input = new BigDecimal(userInput.nextLine());
                calc.setNum2(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input, please enter a number:");
            } catch (NullPointerException e){
                System.out.println("Invalid input, please enter a number:");
            } catch (ArithmeticException e){
                System.out.println("Illegal equation, please enter a number:");
            }

            //Perform equation
            if (op.equals("+")){
                calc.addNums(calc.getNum1(), calc.getNum2());
            } else if (op.equals("-")){
                calc.subtractNums(calc.getNum1(), calc.getNum2());
            } else if (op.equals("*")){
                calc.multiplyNums(calc.getNum1(), calc.getNum2());
            } else if (op.equals("/")){
                calc.divideNums(calc.getNum1(), calc.getNum2());
            }

            display.displayAnswer();
            //Display Num1
            System.out.println(calc.getNum1());
        }
    }
}