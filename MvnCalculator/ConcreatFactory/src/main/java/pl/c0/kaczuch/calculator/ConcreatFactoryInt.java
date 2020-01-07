package pl.c0.kaczuch.calculator;


public class ConcreatFactoryInt implements AbstractFactoryCalculator {
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator TRES=new ConcreatProductInt();
        return TRES;
    }
}
