package pl.c0.kaczuch.calculator;

public interface IICalculator extends IPlugin
{
    public double addDouble(double a, double b);
    public double subtractionDouble(double a, double b);
    public double multiplicationDouble(double a, double b);
    public double divisionDouble(double a, double b);

    public float addFloat(float a, float b);
    public float subtractionFloat(float a, float b);
    public float multiplicationFloat(float a, float b);
    public float divisionFloat(float a, float b);

    public int addInt(int a, int b);
    public int subtractionInt(int a, int b);
    public int multiplicationInt(int a, int b);
    public int divisionInt(int a, int b);
    public void run(IICalculator cal);
}

