package com.Loop;

public class DoWhileLoop {

    public static void main(String[] args) {
        // if no of iteration is not fixed
        //you must have to execute at least once

        int id = 0;
        do {
            System.out.println(id);
            id++;

        } while(id<5);

        // square of numbers till 10

        int a= 1;
        do {
            int square = a*a;
            System.out.println(square);
            a++;
        }while(a<=10);
    }

}