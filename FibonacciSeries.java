package com.Loop;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci series- 0,1,1,2,3,5,8,13...so on
        int num1=0,num2=1,num3;
        for(int i=0;i<10;i++)
        {
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
        //num1=0 , num2=1 , num3= 0+1=1 -> num1=1, num2=1
        //num1=1 , num2=1 , num3= 1+1=2 -> num1=1, num2=2
        //num1=1 , num2=2 , num3= 1+2=3 -> num1=2, num2=3
    }
}