package pl.c0.kaczuch.calculator;


public class Customer
{
    public AbstractProductCalculator calculus;

    public Customer(AbstractFactoryCalculator Calculus2)
    {
        calculus = Calculus2.create();
    }

    public AbstractProductCalculator getCalculatorOfType()
    {
        return calculus;
    }

}
