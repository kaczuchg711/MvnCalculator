
import pl.c0.kaczuch.calculator.IPlugin;

class Pluginotp implements IPlugin
{
    public Pluginotp(String a)
    {
        System.out.println("Pluginotp Constructor");
    }

    public double sqrtDouble(double a)
    {
        return Math.sqrt(a);
    }
    public float sqrtFloat(float a)
    {
        return Math.sqrt(a);
    }
    public int sqrtInt(int a)
    {
        return Math.sqrt(a);
    }
}
