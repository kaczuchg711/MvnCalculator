package pl.c0.kaczuch.calculator;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator implements IICalculator
{
    @Override
    public double add(double a, double b)
    {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b)
    {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b)
    {
        return a * b;
    }

    @Override
    public double division(double a, double b)
    {
        return a / b;
    }

    public double sqrt(double a)
    {
        try
        {
//            ClassLoader cl = ClassLoader.getSystemClassLoader();
//        from file in package
//        Class pclass = cl.loadClass("pl.c0.kaczuch.calculator.Plugin");
//        Constructor<Plugin> pconstructor = pclass.getConstructor();
//        Plugin p = pconstructor.newInstance();
//        return p.sqrt(a);


            File df = new File("Plugin_outside_the_project/target/classes");
            URL url = df.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("Pluginotp");

            Method m[] = cls.getDeclaredMethods();
            for (Method x : m
            )
            {
                System.out.println(x);
            }

//            System.out.println(cls.desiredAssertionStatus());
//                                         i have to add String.class becouse throw nosuchmethodexception
            Constructor<IPlugin> pconstructor = cls.getConstructor(String.class);

//           for IllegalAccessException
            pconstructor.setAccessible(true);

            IPlugin p = pconstructor.newInstance("hej");

            return p.sqrt(a);

        }
        catch (Exception e)
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("\t\t\t\tWROOOOOOOOOOOOOOOOOOOOOOONG");
            }
            System.out.println(e);
            exit(1);
        }
        return 1;
    }

    @Override
    public void run(IICalculator cal)
    {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        boolean exit = false;
        double result = 0;
        while (!exit)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(result);

            System.out.println("input a:");
            int a = sc.nextInt();
            System.out.println("input b:");
            int b = sc.nextInt();

            System.out.println("0.exit");
            System.out.println("1.add");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");



            int choice = sc.nextInt();  // Read user input

            switch (choice)
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    result = cal.add(a, b);
                    System.out.println(result);
                    break;
                case 2:
                    result = cal.subtraction(a, b);
                    System.out.println(result);
                    break;
                case 3:
                    result = cal.multiplication(a, b);
                    System.out.println(result);
                    break;
                case 4:
                    result = cal.division(a, b);
                    System.out.println(result);
                    break;

            }

        }
    }

}
