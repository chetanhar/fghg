package com.Loop;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        String p="";
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i < 10; i++) {
            num3 = num1 + num2;
            p=p+" "+num3;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(p);
        //num1=0 , num2=1 , num3= 0+1=1 -> num1=1, num2=1
        //num1=1 , num2=1 , num3= 1+1=2 -> num1=1, num2=2
        //num1=1 , num2=2 , num3= 1+2=3 -> num1=2, num2=3
    }
}