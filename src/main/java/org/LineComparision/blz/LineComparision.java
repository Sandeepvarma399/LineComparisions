package org.LineComparision.blz;

import java.util.Scanner;

import java.lang.*;
import java.lang.reflect.Method;


public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        int x1, x2, x3, x4, y1, y2, y3, y4;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 point");

        x1 = sc.nextInt();

        System.out.println("enter y1 point");

        y1 = sc.nextInt();

        System.out.println("enter x2point");

        x2 = sc.nextInt();

        System.out.println("enter y2 point");

        y2 = sc.nextInt();
        System.out.println("enter x3 point");

        x3 = sc.nextInt();

        System.out.println("enter y3 point");

        y3 = sc.nextInt();

        System.out.println("enter x4 point");

        x4 = sc.nextInt();

        System.out.println("enter y4 point");

        y4 = sc.nextInt();
        double lineOne = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double lineTwo = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("The Length OF the  First Line Is " + lineOne);
        System.out.println("The Length OF the  Second Line Is " + lineTwo);
        String myStr1 = "lineOne";
        String myStr2 = "lineTwo";

        boolean Answer = myStr1.equals(myStr2);

        if (true) {
            System.out.println("Both lines are  equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }
    }
}











