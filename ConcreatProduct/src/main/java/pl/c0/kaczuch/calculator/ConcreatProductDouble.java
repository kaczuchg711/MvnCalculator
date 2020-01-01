package pl.c0.kaczuch.calculator;


import pl.c0.kaczuch.calculator.Calculator;
import pl.c0.kaczuch.calculator.IICalculator;


import java.util.Scanner;

public class ConcreatProductDouble implements AbstractProductCalculator
{
    IICalculator calculus = new Calculator();

    @Override
    public void addition(double a,double b)
    {
        System.out.println(calculus.addDouble(a, b));
    }

    @Override
    public void substraction(double a,double b)
    {

        System.out.println(calculus.subtractionDouble(a, b));
    }

    @Override
    public void multiplication(double a,double b)
    {

        System.out.println(calculus.multiplicationDouble(a, b));
    }

    @Override
    public void sqrt(double a)
    {
        System.out.println(calculus.sqrtDouble(a));
    }


}

