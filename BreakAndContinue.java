package com.Loop;

public class BreakAndContinue {

    public static void main(String[] args) {
        // Break

        // used to terminate from loop immediately
        //when student id is 5 then stop execution


        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }

            System.out.print(i);
        }
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.print(j);
        }


    }}