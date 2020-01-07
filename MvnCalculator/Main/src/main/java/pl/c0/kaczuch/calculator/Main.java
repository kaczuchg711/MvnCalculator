package pl.c0.kaczuch.calculator;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class Main
{

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        CalculatorView cv = new CalculatorView();
        CalculatorModelFacade cm = new CalculatorModelFacade();

        CalculatorController cc = new CalculatorController(cm,cv);

        cv.setVisible(true);

    }
}
