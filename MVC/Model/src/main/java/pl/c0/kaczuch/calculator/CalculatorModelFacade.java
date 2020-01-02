package pl.c0.kaczuch.calculator;

public class CalculatorModelFacade
{
    private AbstractProductCalculator calculator;

    public CalculatorModelFacade()
    {
        AbstractFactoryCalculator factory = new ConcreatFactoryFloat();

        this.calculator = factory.create();

    }
}
