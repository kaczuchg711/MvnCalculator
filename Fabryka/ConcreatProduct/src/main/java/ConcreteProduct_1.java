public class ConcreteProduct_1 implements AbstractProduct_Table {

    @Override
    public int legs(int a){
        System.out.println("variant 1 - legs:"+a);
        return a;};

    @Override
    public int addons(int a){
        System.out.println("variant 1 - addons"+a);
        return a;};
}