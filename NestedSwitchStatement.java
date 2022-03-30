package com.Loop;

public class NestedSwitchStatement {

    public static void main(String[] args) {
        // student ->1,2,3 -> 1st year common subject; 2nd year -> depends on department (ME, CE)

        int year = 2;
        String dept = "ME";

        switch (year) {
            case 1:
                System.out.println("all subjects");
                break;
            case 2:
                switch (dept) {
                    case "ME":
                        System.out.println(" thermo ");
                        break;

                    case "CE":
                        System.out.println(" transportation ");
                        break;

                    default:
                        System.out.println("Invalid dept");
                }

        }

    }}