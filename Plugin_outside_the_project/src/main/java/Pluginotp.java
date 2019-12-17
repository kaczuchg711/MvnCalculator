
import pl.c0.kaczuch.calculator.IPlugin;

class Pluginotp implements IPlugin
{
    public Pluginotp(String a)
    {
        System.out.println("Pluginotp Constructor new");
    }

    public int sqrtInt(int a)
    {
        return (int)Math.sqrt(a);
    }
    public float sqrtFloat(float a)
    {
        return (float)Math.sqrt(a);
    }
    public double sqrtDouble(double a)
    {
        return (double)Math.sqrt(a);
    }


}
