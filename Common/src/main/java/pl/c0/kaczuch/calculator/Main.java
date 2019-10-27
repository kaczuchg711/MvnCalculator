package pl.c0.kaczuch.calculator;

import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Main");
        IIICalculator cal = new CCCalculator();
        System.out.println(cal.add(1,2));
    }
}
