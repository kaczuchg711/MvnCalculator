package pl.c0.kaczuch.calculator;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        System.out.println("Main");

        String current = new java.io.File(".").getCanonicalPath();
        System.out.println(current);
        File f = new File("./Common/src/main/java/pl/c0/kaczuch/calculator/plugins/Plugin.jar");
//        System.out.println(f.exists());

        ClassLoader c = ClassLoader.getSystemClassLoader();


        System.out.println( c.loadClass(f.getName()));





//        IIICalculator cal = new CCCalculator();
//        cal.run(cal);
    }
}
