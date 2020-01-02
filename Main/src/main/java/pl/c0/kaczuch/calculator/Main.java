package pl.c0.kaczuch.calculator;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class Main
{

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {

//        AbstractFactoryCalculator One = new ConcreatFactoryDouble();
//        AbstractFactoryCalculator Two = new ConcreatFactoryFloat();
//        AbstractFactoryCalculator Three = new ConcreatFactoryInt();
//
//        AbstractProductCalculator cal = Two.create();

        CalculatorView cv = new CalculatorView();
        CalculatorModelFacade cm = new CalculatorModelFacade();


        cv.setVisible(true);

    }
}
