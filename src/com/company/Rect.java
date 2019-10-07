package com.company;

import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        int x;
        int y;
        int u;
        int v;
        int w;
        int h;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        u = s.nextInt();
        v = s.nextInt();
        w = s.nextInt();
        h = s.nextInt();

        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("w= " + w);
        System.out.println("h= " + h);
        System.out.println("u= " + u);
        System.out.println("v= " + v);
        if ((u > x) && (u < (x + w)) && (v < y) && (v > (y - h))) {
            System.out.println("внутри");
        } else if ((v > y) || (u < x) || (u > (x + w)) || (u < (y - h))) {
            System.out.println("вне");
        } else {
            System.out.println("на границе");
        }
    }
}