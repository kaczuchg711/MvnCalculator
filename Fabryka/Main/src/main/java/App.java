public class App {

    public static void main( String[] args )
    {
        /*
        Sprawdzimy dzialanie dla kazdego wariantu(zmienne ponizej twozone sa z mysla o argumencie
        construktora klasy Customer (sprawdzimy sobie 3 przykladowe wariany produktow)
         */
        AbstractFactory Variant1=new ConcretaFactoryOfVariant1();
        AbstractFactory Variant2=new ConcretaFactoryOfVariant2();
        AbstractFactory Variant3=new ConcretaFactoryOfVariant3();

        Customer One=new Customer(Variant1);
        System.out.println(One.legs(4));
        System.out.println(One.addons(3)+"\n\n");

        Customer Two=new Customer(Variant2);
        System.out.println(Two.legs(3));
        System.out.println(Two.addons(2)+"\n\n");

        Customer Three=new Customer(Variant3);
        System.out.println(Three.legs(5));
        System.out.println(Three.addons(5));

    }
}
