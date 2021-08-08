package com.manko.mvccalculator.model;

/**
 * This code was written by the example from the next video lesson
 * https://www.youtube.com/watch?v=dTVVa2gfht8&feature=emb_rel_pause
 */
public class CalculatorModel {

    private int calculationValue;

    public int getCalculationValue() {
        return calculationValue;
    }

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }

    public void subtractTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber - secondNumber;
    }
}
