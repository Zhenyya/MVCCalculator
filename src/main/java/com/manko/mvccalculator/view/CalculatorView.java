package com.manko.mvccalculator.view;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This code was written by the example from the next video lesson
 * https://www.youtube.com/watch?v=dTVVa2gfht8&feature=emb_rel_pause
 */
public class CalculatorView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+"); // the sign <+> will be shown here
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    // this method is never used
    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    //this method will be called from outside - from Controller
    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    // When User click on the button <Calculate>, Controller will be informed about this action.
    // Hey, Controller, do something with this, because I am View and it's not my job))

    public void addCalculationListener(ActionListener listenerForCalcButton) {
        calculateButton.addActionListener(listenerForCalcButton);
    }

    // If User click on the button without numbers' input, View only displays the error message

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}