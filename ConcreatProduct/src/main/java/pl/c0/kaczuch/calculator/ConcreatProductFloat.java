package pl.c0.kaczuch.calculator;


import pl.c0.kaczuch.calculator.Calculator;
import pl.c0.kaczuch.calculator.IICalculator;

import java.util.Scanner;

public class ConcreatProductFloat implements AbstractProductCalculator
{
    IICalculator calculus = new Calculator();

    @Override
    public void addition(double a, double b)
    {
        System.out.println(calculus.addFloat((float) a, (float) b));
    }

    @Override
    public void substraction(double a, double b)
    {
        System.out.println(calculus.subtractionFloat((float) a, (float) b));
    }

    @Override
    public void multiplication(double a, double b)
    {

        System.out.println(calculus.multiplicationFloat((float) a, (float) b));
    }

    @Override
    public void sqrt(double a)
    {
        System.out.println(calculus.sqrtDouble(a));
    }

}

