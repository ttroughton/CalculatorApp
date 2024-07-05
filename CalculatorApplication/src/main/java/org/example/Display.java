package org.example;

public class Display {

    public void mainMenu(){

        System.out.println("Welcome to my calculator!");


        System.out.println("Please enter a number to get started:");
    }

    public void promptForOperator(){

        System.out.println("Please select an operator:");
        System.out.println("'+' for addition");
        System.out.println("'-' for subtraction");
        System.out.println("'*' for multiplication");
        System.out.println("'/' for division");
        System.out.println("If you're finished, enter 'off'");
    }

    public void promptForNumber(){
        System.out.println("Please enter the next number of your equation:");
    }

    public void displayAnswer(){
        System.out.println("Your answer is:");
    }
}
