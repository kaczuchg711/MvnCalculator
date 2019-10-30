package pl.c0.kaczuch.calculator;

import java.util.Calendar;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Main");
        IIICalculator cal = new CCCalculator();

        cal.run(cal);

    }
}
