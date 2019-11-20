public class ConcreteProduct_3 implements AbstractProduct_Table{

    @Override
    public int legs(int c){
        System.out.println("variant c - legs"+c);
        return c;
    }

    @Override
    public int addons(int c){
        System.out.println("variant c - addons"+c);
        return c;
    }
}
