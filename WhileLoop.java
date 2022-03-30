package com.Loop;

public class WhileLoop {

    public static void main(String[] args) {
        // While loop is used when no of iteration is not fixed
        //Repetition of part of program multiple times

        int id = 0;
        while (id<5) {
            System.out.println(id);
            id++;
        }


        // square of numbers till 10
        int a = 1;
        while(a<=10) {
            int square = a * a;
            System.out.println(square);
        }

    }

}