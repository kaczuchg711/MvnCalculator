package pl.c0.kaczuch.calculator;

public class CalculatorModelFacade
{
    private AbstractProductCalculator calculator;

    public CalculatorModelFacade()
    {
        AbstractFactoryCalculator factory = new ConcreatFactoryDouble();

        this.calculator = factory.create();
    }

    public double add(double input1, double input2)
    {
        return calculator.addition(input1, input2);
    }

    public double subtraction(double input1,double input2)
    {
        return calculator.subtraction(input1, input2);
    }

    public double multiplication(double input1,double input2)
    {
        return calculator.multiplication(input1, input2);
    }

    public double sqrt(double input1)
    {
        return calculator.sqrt(input1);
    }
}
