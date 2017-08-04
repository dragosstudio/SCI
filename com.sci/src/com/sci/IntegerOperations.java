package com.sci;


/**
 * Created by algatu on 27/07/2017.
 */
public class IntegerOperations {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        System.out.println("a -> " + a + " \nb -> " + b);
        System.out.println("Sum equals " + sum);
        System.out.println("Product is " + prod);
        //System.out.println(a++);
        //System.out.println(a);

        int x = 1600;
        if (x % 4 == 0) {
            if (x % 100 != 0) {
                System.out.println(29);
            }
            else {
                if (x % 400 != 0) {
                    System.out.println(29);
                }
                else {
                    System.out.println(28);
                }
            }
        }
        else {
            System.out.println(28);
        }

    }
}
