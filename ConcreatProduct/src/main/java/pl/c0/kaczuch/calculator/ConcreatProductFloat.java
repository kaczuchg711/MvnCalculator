package pl.c0.kaczuch.calculator;


import pl.c0.kaczuch.calculator.Calculator;
import pl.c0.kaczuch.calculator.IICalculator;

import java.util.Scanner;

public class ConcreatProductFloat implements AbstractProductCalculator
{
    IICalculator calculus = new Calculator();

    @Override
    public double addition(double a,double b)
    {
        return calculus.addDouble(a, b);
    }

    @Override
    public double subtraction(double a,double b)
    {
        return calculus.subtractionDouble(a, b);
    }

    @Override
    public double multiplication(double a,double b)
    {
        return calculus.multiplicationDouble(a, b);
    }

    @Override
    public double sqrt(double a)
    {
        return calculus.sqrtDouble(a);
    }

}

