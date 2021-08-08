package com.manko.mvccalculator;

import com.manko.mvccalculator.controller.*;
import com.manko.mvccalculator.model.CalculatorModel;
import com.manko.mvccalculator.view.ConsoleView;

/**
 * Created by Zhenya on 04.09.2020.
 */
public class ConsoleApp {

    public static void main(String[] args) {

        CalculatorModel model = new CalculatorModel();
        ConsoleView view = new ConsoleView();
        Controller controller = new ConsoleController(model, view);

        controller.run();
    }
}
