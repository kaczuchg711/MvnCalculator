package pl.c0.kaczuch.calculator;

public class CCCalculator implements IIICalculator
{
    @Override
    public double add(double a, double b)
    {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b)
    {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b)
    {
        return a*b;
    }

    @Override
    public double division(double a, double b)
    {
        return a/b;
    }
}
