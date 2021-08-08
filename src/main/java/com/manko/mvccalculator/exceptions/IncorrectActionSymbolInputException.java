package com.manko.mvccalculator.exceptions;

/**
 * Created by Zhenya on 06.09.2020.
 */
public class IncorrectActionSymbolInputException extends RuntimeException {

    @Override
    public String getMessage() {
        return "You input incorrect action symbol! Please try again.";
    }
}