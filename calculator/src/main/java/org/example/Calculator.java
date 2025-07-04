package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static int addition(int a ,int b){
        return a+b;
    }
    public static int subtraction(int a ,int b){
        return a-b;
    }
    public static int multiplication(int a ,int b){
        return a*b;
    }
    public static int division(int a ,int b){
        if(b==0){
            throw new IllegalArgumentException("cannot divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition is "+ addition(a,b));
        System.out.println("Subtraction is "+subtraction(a,b));
        System.out.println("Mulitplication is "+multiplication(a,b));
        System.out.println("Division is "+division(a,b));
    }
}
