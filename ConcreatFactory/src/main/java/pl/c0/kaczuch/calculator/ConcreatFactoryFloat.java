package pl.c0.kaczuch.calculator;


public class ConcreatFactoryFloat implements AbstractFactoryCalculator{
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator DOS =new ConcreatProductFloat();
        return DOS;
    }
}
