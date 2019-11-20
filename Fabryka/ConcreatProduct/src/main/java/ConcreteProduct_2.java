public class ConcreteProduct_2 implements AbstractProduct_Table {

    @Override
    public int legs(int b){
        System.out.println("variant b - legs"+b);
        return b;
    }

    @Override
    public int addons(int b){
        System.out.println("variant b - addons"+b);
        return b;
    }

}