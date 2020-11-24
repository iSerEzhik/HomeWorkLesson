package ru.gb.Homework1;

import java.util.Scanner;

public class homework1
{


    //ex1
    public static void main(String[] args)
    { //ex 2
        int a=5;
        float b=2;
        double c=2.55;
        char g='g';
        String f="Hi";
        boolean z=true;
        System.out.println("Ex3:");// ex3
        System.out.println(ex3(5,2,7,3));
        System.out.println("Ex4:");// ex4
        if (ex4(5,10))
        {
            System.out.println("Сумма лежит в промежутке");
        }
        else
        {
            System.out.println("Сумма не лежит в промежутке");
        }
        if (ex4(20,10))
        {
            System.out.println("Сумма лежит в промежутке");
        }
        else
        {
            System.out.println("Сумма не лежит в промежутке");
        }
        System.out.println("Ex5:");   // ex5
        ex5(10);
        ex5(-5);
        System.out.println("Ex6:");   // ex6
        System.out.println(ex6(-5));
        System.out.println("Ex7:");// ex7
        ex7("Илья");
        System.out.println("Ex8:");// ex8
        ex8();
    }

    static float ex3(int a,int b,float c,float d)
    {
        return(a*(b+c/d));
    }

    static boolean ex4(int a, int b)
    {
        if ((a+b>=10)&&(a+b<=20))
        {
            return(true);
        }
        else return (false);
    }
    static void ex5(int a)
    {
        if (a>=0)
        {
            System.out.println(a+" :Положительное");
        }
        else
        {
            System.out.println(a+" :Отрицательное");
        }
    }
    static boolean ex6(int a)
    {
        if (a<0) return(true);
        else return(false);
    }
    static void ex7(String b)
    {
        System.out.println("Hello, "+b);
    }
    static void ex8()
    {
        Scanner read= new Scanner(System.in);
        System.out.print("Введите год: ");
        int a=read.nextInt();
        if (((a%4)==0) && ((a%100!=0) || (a%400==0)))
        {
            System.out.println("Високосный");
        }
        else
        {
            System.out.println("Не високосный");
        }

    }
}
