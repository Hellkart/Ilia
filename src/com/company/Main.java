package com.company;

import javax.naming.Name;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);
          if (c > b) {
            System.out.println("после b");
        } else if (c < a) {
            System.out.println("перед a");
        } else if (c == a) {
            System.out.println("на точке a");
        } else if (c == b) {
            System.out.println("на точке b");
        } else {
              System.out.println("между a и b");
          }
    }
}