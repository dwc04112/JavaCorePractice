package com.exam.lambda;

import java.util.Scanner;

public class lambdaExam {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();

        myCalc sum = (a,b) -> {return a+b; };
        System.out.println(sum.calc(num1,num2));

        myCalc2 multi = a -> {return a*a;};
        System.out.println(multi.calc(num1));
        sc.close();
    }

    @FunctionalInterface
    interface myCalc{
        int calc(int x, int y);
    }
    @FunctionalInterface
    interface myCalc2{
        int calc(int x);
    }
}
