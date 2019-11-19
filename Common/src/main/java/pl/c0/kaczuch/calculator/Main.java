package pl.c0.kaczuch.calculator;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {

//        w CCCalculator
//        CCCalculator c = new CCCalculator();
//        System.out.println("1");
//        System.out.println(c.sqrt(4));

//        String current = new java.io.File(".").getCanonicalPath();
//        System.out.println(current);

//        File f = new File("./Common/src/main/java/pl/c0/kaczuch/calculator/plugins/Plugin");
//        System.out.println(f.getName());
//
//        ClassLoader c = ClassLoader.getPlatformClassLoader();
//
//            System.out.println(f.getName());
//            String ff = "plugins" + f.getName();
//            c.getResource("./Common/src/main/java/pl/c0/kaczuch/calculator/plugins/Plugin");

//        Class c = Class.forName("pl.c0.kaczuch.calculator.plugins.Plugin");
//        Method m[] = c.getDeclaredMethods();
//        Method mysqrt = m[0];
//
//        System.out.println(mysqrt.);


//        w main
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        Class pclass = cl.loadClass("pl.c0.kaczuch.calculator.Plugin");
        Constructor<Plugin> pconstructor = pclass.getConstructor();
        Plugin p = pconstructor.newInstance();
        System.out.println(p.sqrt(2));




    }
}
