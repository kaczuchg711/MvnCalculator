public class ConcretaFactoryOfVariant1 implements AbstractFactory {

    @Override
    public AbstractProduct_Table Create(){
        AbstractProduct_Table ProductONE=new ConcreteProduct_1();
        return ProductONE;
    }
}