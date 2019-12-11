package pl.c0.kaczuch.calculator;

public interface IICalculator extends IPlugin
{
    public double add(double a, double b);
    public double subtraction(double a, double b);
    public double multiplication(double a, double b);
    public double division(double a, double b);
    public void run(IICalculator cal);
}

