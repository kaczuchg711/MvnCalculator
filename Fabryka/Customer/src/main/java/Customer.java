public class Customer {
    private AbstractProduct_Table Table;

    public Customer(AbstractFactory Factory){
        Table=Factory.Create();
    }

    public int legs(int AmountOfLegs){
        return Table.legs(AmountOfLegs);
    };

    public int addons(int AmountOfaddons){
        return Table.addons(AmountOfaddons);
    };
}