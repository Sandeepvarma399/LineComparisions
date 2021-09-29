package org.LineComparision.blz;

import java.util.Scanner;


public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");

        int x1, x2, y1, y2;
        double lengthOfALine;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 point");

        x1 = sc.nextInt();

        System.out.println("enter y1 point");

        y1 = sc.nextInt();

        System.out.println("enter x2point");

        x2 = sc.nextInt();

        System.out.println("enter y2 point");

        y2 = sc.nextInt();
        lengthOfALine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The Length OF the length Of The Line Is " + lengthOfALine);


    }
}
