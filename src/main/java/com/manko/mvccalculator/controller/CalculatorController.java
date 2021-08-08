package com.manko.mvccalculator.controller;

import com.manko.mvccalculator.model.*;
import com.manko.mvccalculator.view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This code was written by the example from the next video lesson
 * https://www.youtube.com/watch?v=dTVVa2gfht8&feature=emb_rel_pause
 */
public class CalculatorController implements Controller {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // we say to Controller here that whenever the button will be clicked
        // an action that is described in inner class should be executed
        // class CalculateListener is described below

        this.theView.addCalculationListener(new CalculateListener());
    }

    @Override
    public void run() {
        theView.setVisible(true);
    }

    class CalculateListener implements ActionListener {

        // all interaction will be in this method
        public void actionPerformed(ActionEvent arg0) {

            int firstNumber, secondNumber = 0;
            // try-catch block to avoid exception in case the user didn't enter two integer numbers
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getCalculationValue());
            } catch(NumberFormatException ex) {
                theView.displayErrorMessage("You need to enter two Integer numbers");
            }
        }
    }
}