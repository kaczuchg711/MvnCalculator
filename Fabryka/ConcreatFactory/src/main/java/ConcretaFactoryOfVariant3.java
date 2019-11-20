public class ConcretaFactoryOfVariant3 implements AbstractFactory {

    @Override
    public AbstractProduct_Table Create(){
        AbstractProduct_Table ProductTHREE=new ConcreteProduct_3();
        return ProductTHREE;
    }
}
