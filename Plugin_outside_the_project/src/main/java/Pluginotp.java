
import pl.c0.kaczuch.calculator.IPlugin;

class Pluginotp implements IPlugin
{
    public Pluginotp(String a)
    {
        System.out.println("Pluginotp Constructor");
    }

    public double sqrt(double a)
    {
        return Math.sqrt(a);
    }
    public  void hi()
    {
        System.out.println("siemanko");
    }
}
