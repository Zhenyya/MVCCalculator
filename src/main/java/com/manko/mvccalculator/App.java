package com.manko.mvccalculator;

import com.manko.mvccalculator.controller.*;
import com.manko.mvccalculator.model.CalculatorModel;
import com.manko.mvccalculator.view.CalculatorView;

/**
 * Created by Zhenya on 24.08.2020.
 */
public class App {

    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        Controller theController = new CalculatorController(theView, theModel);

        theController.run();
    }
}
