package pl.c0.kaczuch.calculator;


import pl.c0.kaczuch.calculator.Calculator;
import pl.c0.kaczuch.calculator.IICalculator;

import java.util.Scanner;

public class ConcreatProductInt implements AbstractProductCalculator
{
    IICalculator calculus = new Calculator();

    @Override
    public void addition(double a, double b)
    {
        System.out.println(calculus.addInt((int)a, (int)b));
    }

    @Override
    public void substraction(double a, double b)
    {
        System.out.println(calculus.subtractionInt((int)a, (int)b));
    }

    @Override
    public void multiplication(double a, double b)
    {
        System.out.println(calculus.multiplicationInt((int)a, (int)b));
    }

    @Override
    public void sqrt(double a)
    {
        System.out.println(calculus.sqrtInt((int)a));
    }


}


