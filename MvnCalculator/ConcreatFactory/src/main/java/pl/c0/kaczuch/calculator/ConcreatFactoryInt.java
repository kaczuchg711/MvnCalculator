package pl.c0.kaczuch.calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreatFactoryInt implements AbstractFactoryCalculator {
    private static final Logger log = LoggerFactory.getLogger(ConcreatFactoryInt.class);
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator TRES=new ConcreatProductInt();
        log.info("Abstract Product Calculator created");
        return TRES;
    }
}
