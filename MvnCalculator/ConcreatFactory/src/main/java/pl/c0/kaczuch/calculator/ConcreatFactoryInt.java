package pl.c0.kaczuch.calculator;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class ConcreatFactoryInt implements AbstractFactoryCalculator {
    private static final Logger log = (Logger) LoggerFactory.getLogger(ConcreatFactoryInt.class);
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator TRES=new ConcreatProductInt();
        log.setLevel(Level.INFO);
        log.info("Abstract Product Calculator created");
        return TRES;
    }
}
