package pl.c0.kaczuch.calculator;


import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;


public class Main
{
    /*to co tu robie to moze być ultra glupota, najwyzej to usune*/
    private static final Logger log = (Logger) LoggerFactory.getLogger(Main.class);
    /*to co tu robie to moze być ultra glupota, najwyzej to usune*/

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        log.setLevel(Level.INFO);
        CalculatorView cv = new CalculatorView();
        log.info("CalculatorView created");
        CalculatorModelFacade cm = new CalculatorModelFacade();
        log.info("CalculatorModelFacade created");
        CalculatorController cc = new CalculatorController(cm,cv);
        log.info("CalculatorController created");
        cv.setVisible(true);

    }
}
