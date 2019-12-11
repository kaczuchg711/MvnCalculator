package pl.c0.kaczuch.calculator;


import pl.c0.kaczuch.calculator.Calculator;
import pl.c0.kaczuch.calculator.IICalculator;

import java.util.Scanner;
public class ConcreatProductInt implements AbstractProductCalculator {
    IICalculator calculus=new Calculator();
    @Override
    public void addition(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("input a:");
        int a = sc.nextInt();
        System.out.println("input b:");
        int b = sc.nextInt();
        System.out.println( calculus.addInt(a,b));
    }

    @Override
    public void substraction(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("input a:");
        int a = sc.nextInt();
        System.out.println("input b:");
        int b = sc.nextInt();
        System.out.println( calculus.subtractionInt(a,b));
    }

    @Override
    public void multiplication(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("input a:");
        int a = sc.nextInt();
        System.out.println("input b:");
        int b = sc.nextInt();
        System.out.println( calculus.multiplicationInt(a,b));
    }

    @Override
    public void division(){
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("input a:");
        int a = sc.nextInt();
        System.out.println("input b:");
        int b = sc.nextInt();
        System.out.println( calculus.sqrtInt(a));
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        boolean exit = false;
        while (!exit)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
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
                    addition();
                    break;
                case 2:
                    substraction();
                    break;
                case 3:
                    division();
                    break;
                case 4:
                    division();
                    break;

            }

        }
    }

}
