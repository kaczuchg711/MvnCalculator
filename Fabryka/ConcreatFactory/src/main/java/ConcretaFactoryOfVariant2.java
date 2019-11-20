public class ConcretaFactoryOfVariant2 implements AbstractFactory {

    @Override
    public AbstractProduct_Table Create(){
        AbstractProduct_Table ProductTWO=new ConcreteProduct_2();
        return ProductTWO;
    }

}