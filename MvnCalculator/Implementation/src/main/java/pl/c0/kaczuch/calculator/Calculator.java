package pl.c0.kaczuch.calculator;

import org.slf4j.Marker;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

        public class Calculator implements IICalculator
{
    private static final Logger log = LoggerFactory.getLogger(Calculator.class);

    @Override
    public double addDouble(double a, double b)
    {
        return a + b;
    }

    @Override
    public float addFloat(float a, float b)
    {
        return a + b;
    }

    @Override
    public int addInt(int a, int b)
    {
        return a + b;
    }

    @Override
    public double subtractionDouble(double a, double b)
    {
        return a - b;
    }

    @Override
    public float subtractionFloat(float a, float b)
    {
        return a - b;
    }

    @Override
    public int subtractionInt(int a, int b)
    {
        return a - b;
    }

    @Override
    public double multiplicationDouble(double a, double b)
    {
        return a * b;
    }

    @Override
    public float multiplicationFloat(float a, float b)
    {
        return a * b;
    }

    @Override
    public int multiplicationInt(int a, int b)
    {
        return a * b;
    }

    @Override
    public double divisionDouble(double a, double b)
    {
        return a / b;
    }

    @Override
    public float divisionFloat(float a, float b)
    {
        return a / b;
    }

    @Override
    public int divisionInt(int a, int b)
    {
        return a / b;
    }

    public double sqrtDouble(double a)
    {
        try
        {
            File df = new File("Plugin_outside_the_project/target/classes");
            log.info("Plugin in file-pathname ok");
            URL url = df.toURI().toURL();
            URL[] urls = new URL[]{url};
            log.info("url ok");
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("Pluginotp");
            log.info("classloader ok");

//            System.out.println(cls.desiredAssertionStatus());
//                                         i have to add String.class becouse throw nosuchmethodexception
            Constructor<IPlugin> pconstructor = cls.getConstructor(String.class);
            log.info("constructor of plugin done");
//           for IllegalAccessException
            pconstructor.setAccessible(true);

            IPlugin p = pconstructor.newInstance("hej");
            log.info("plugin done");
            return p.sqrtDouble(a);

        }
        catch (Exception e)
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("\t\t\t\tWROOOOOOOOOOOOOOOOOOOOOOONG");
            }
            System.out.println(e);
            log.error(e.getMessage(),Calculator.class.getSimpleName());
            exit(1);
        }
        return 1;
    }

    public float sqrtFloat(float a)
    {
        try
        {

            File df = new File("Plugin_outside_the_project\\target\\classes");
            log.info("Plugin in file-pathname ok");
            URL url = df.toURI().toURL();
            URL[] urls = new URL[]{url};
            log.info("url ok");
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("Pluginotp");
            log.info("classloader ok");
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
            log.info("plugin done");
            return p.sqrtFloat(a);

        }
        catch (Exception e)
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("\t\t\t\tWROOOOOOOOOOOOOOOOOOOOOOONG");
            }
            System.out.println(e);
            log.error(e.getMessage(),Calculator.class.getSimpleName());
            exit(1);
        }
        return 1;
    }

    public int sqrtInt(int a)
    {
        try
        {

            File df = new File("Plugin_outside_the_project\\target\\classes");
            log.info("Plugin in file-pathname ok");
            URL url = df.toURI().toURL();
            URL[] urls = new URL[]{url};
            log.info("url ok");
            ClassLoader cl = new URLClassLoader(urls);
            Class cls = cl.loadClass("Pluginotp");
            log.info("classloader ok");
            Method m[] = cls.getDeclaredMethods();
            for (Method x : m
            )
            {
                System.out.println(x);
            }

            //                 i have to add String.class becouse throw nosuchmethodexception
            Constructor<IPlugin> pconstructor = cls.getConstructor(String.class);
            log.info("constructor of plugin done");
//           for IllegalAccessException
            pconstructor.setAccessible(true);

            IPlugin p = pconstructor.newInstance("hej");
            log.info("plugin done");
            return p.sqrtInt(a);

        }
        catch (Exception e)
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("\t\t\t\tWROOOOOOOOOOOOOOOOOOOOOOONG");
            }
            System.out.println(e);
            log.error(e.getMessage(),Calculator.class.getSimpleName());
            exit(1);
        }
        return 1;
    }

    @Override
    public void run(IICalculator cal)
    {
        /*Scanner sc = new Scanner(System.in);  // Create a Scanner object
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

        }*/
    }

    @Override
    public void hi()
    {
        System.out.println("siema");
    }

}
