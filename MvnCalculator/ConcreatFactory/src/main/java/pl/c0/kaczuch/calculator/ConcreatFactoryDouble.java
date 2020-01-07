package pl.c0.kaczuch.calculator;


public class ConcreatFactoryDouble implements AbstractFactoryCalculator{
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator UNO=new ConcreatProductDouble();
        return UNO;
    }
}
