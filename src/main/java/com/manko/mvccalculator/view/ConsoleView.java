package com.manko.mvccalculator.view;

import java.util.Scanner;

/**
 * Created by Zhenya on 06.09.2020.
 */
public class ConsoleView {

    private Scanner scanner;
    private int result;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void setResult(int result) {
        this.result = result;
    }

    private void showMainMenu() {
        System.out.println("\nPlease input \"Y\" if you want to perform the calculation. " +
                "Input \"Q\" for exit.");
    }

    public String start() {
        showMainMenu();
        return scanner.nextLine().toUpperCase();
    }

    public int enterIntegerNumber() {
        System.out.println("Input Integer number:");
        return Integer.parseInt(scanner.nextLine());
    }

    public String enterActionSymbol() {
        System.out.println("Input the symbol of operation:");
        System.out.println("+ if you want to add two numbers");
        System.out.println("- if you want to subtract two numbers");
        return scanner.nextLine();
    }

    public void showErrorMessage(String message) {
        System.out.println(message);
    }

    public void showResult() {
        System.out.println("The result of calculation is " + result);
    }
}
