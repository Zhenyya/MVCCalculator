package com.manko.mvccalculator.controller;

import com.manko.mvccalculator.exceptions.IncorrectActionSymbolInputException;
import com.manko.mvccalculator.model.CalculatorModel;
import com.manko.mvccalculator.view.ConsoleView;

/**
 * Created by Zhenya on 05.09.2020.
 */
public class ConsoleController implements Controller {

    private CalculatorModel model;
    private ConsoleView view;

    public ConsoleController(CalculatorModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        String status;
        do {
            status = view.start();
            if (status.equals("Y")) {
                int firstNumber, secondNumber;
                // try-catch block to avoid exception in case incorrect user's input
                try {
                    firstNumber = view.enterIntegerNumber();
                    secondNumber = view.enterIntegerNumber();
                    operate(firstNumber, secondNumber);
                    view.setResult(model.getCalculationValue());
                    view.showResult();
                } catch (NumberFormatException ex) {
                    view.showErrorMessage("You need to enter two Integer numbers! Please try again.");
                } catch (IncorrectActionSymbolInputException rex) {
                    view.showErrorMessage(rex.getMessage());
                }
            }
        } while (!status.equals("Q"));
    }

    private void operate(int firstNumber, int secondNumber) throws IncorrectActionSymbolInputException {
        String operation = view.enterActionSymbol();
        switch (operation) {
            case "+":
                model.addTwoNumbers(firstNumber, secondNumber);
                break;
            case "-":
                model.subtractTwoNumbers(firstNumber, secondNumber);
                break;
            default:
                throw new IncorrectActionSymbolInputException();
        }
    }
}