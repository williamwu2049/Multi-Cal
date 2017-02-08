package com.willtheconqueror.calculator;

import java.text.DecimalFormat;

/**
 * Created by William on 12/21/16.
 */
public class calculatorBrain {
    private double firstInput;
    private double secondInput;

    //constructor

    public calculatorBrain(double x1, double x2) {
        firstInput = x1;
        secondInput = x2;
    }

    //mutator
    public double add() {
        return Math.round(firstInput + secondInput);
    }
    public double minus() {
        return firstInput - secondInput;
    }
    public double multiply() {
        return firstInput * secondInput;
    }
    public double divide() {
        //cast the output
        DecimalFormat formatDouble = new DecimalFormat("#.#######");
        return Double.valueOf(formatDouble.format(firstInput / secondInput));
    }
    public double remain() {
        //cast the output
        DecimalFormat formatDouble = new DecimalFormat("#.#######");
        return Double.valueOf(formatDouble.format(firstInput % secondInput));
    }
}
