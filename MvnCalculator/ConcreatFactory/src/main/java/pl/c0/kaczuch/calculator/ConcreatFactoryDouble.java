package pl.c0.kaczuch.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreatFactoryDouble implements AbstractFactoryCalculator {
    private static final Logger log = LoggerFactory.getLogger(ConcreatFactoryDouble.class);
    @Override
    public AbstractProductCalculator create(){
        AbstractProductCalculator UNO=new ConcreatProductDouble();
        log.info("Abstract Product Calculator created");
        return UNO;
    }
}
