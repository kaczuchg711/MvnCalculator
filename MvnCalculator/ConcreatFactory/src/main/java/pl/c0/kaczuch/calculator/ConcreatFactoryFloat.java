package pl.c0.kaczuch.calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreatFactoryFloat implements AbstractFactoryCalculator{
    private static final Logger log =LoggerFactory.getLogger(ConcreatFactoryFloat.class);
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator DOS =new ConcreatProductFloat();
        log.info("Abstract Product Calculator created");
        return DOS;
    }
}
