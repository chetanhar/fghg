package com.Loop;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        //for loop is used when no of iteration of program is fixed
        //repeat multiple times
        //generate studentid
        for(int a=0;a<10;a++)
            System.out.println("studentid= "+a);
        //find even and odd no from range
        //ex-1,2,.....10=>output->even no:2 4 6 8 10->odd no:1 3 5 7 9
        for(int i=1;i<=10;i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("even " + i);
            }
            else
            {
                System.out.println("odd "+i);
            }
        }
    }
}