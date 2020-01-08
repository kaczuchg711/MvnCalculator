package pl.c0.kaczuch.calculator;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;



public class ConcreatFactoryDouble implements AbstractFactoryCalculator {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ConcreatFactoryDouble.class);
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator UNO=new ConcreatProductDouble();
        log.setLevel(Level.INFO);
        log.info("Abstract Product Calculator created");
        return UNO;
    }
}
