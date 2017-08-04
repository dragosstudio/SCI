package com.sci;

/**
 * Created by algatu on 01/08/2017.
 */
public class MethodDemo {

    public static int test(int testVal, int target) {
        int result = 0;
        if (testVal>target) {
            result = 1;
        }
        else  {
            if (testVal < target) {
                result = -1;
            }
            else {
                result = 0;
            }
        }
        return result;
    }

    public static int test2 (int testVal, int target) {
        if (testVal > target) {
            return 1;
        }
        else {
            if (testVal < target) {
                return -1;
            }
        }
        return 0;
    }

    public static boolean isOddNumber(int x) {
        //return (x%2==1) ? true : false;
        if (x % 2 == 1) {
            return true;
        }
        return false;
    }

    public static void drawFullShape(int width, int height) {
        for (int j =0; j< height;j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawFullShape(int width, int height, char symb) {
        for (int j =0; j< height;j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(symb);
            }
            System.out.println();
        }
    }

    public static void drawShapeOutline(int width, int height) {
        for (int j =0; j< height;j++) {
            for (int i = 0; i < width; i++) {
                if (j==0 || j==height-1) {
                    System.out.print("*");
                }
                else {
                    if (i==0 || i==width-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void drawShapeCorners(int width, int height) {
        for (int j =0; j< height;j++) {
            for (int i = 0; i < width; i++) {
                if (j==0 || j ==height -1) {
                    if (i==0 || i == width-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawShape (int w) {
        drawFullShape(w,w);
    }

    public static void drawShape (int w, int h) {
        drawFullShape(w,h);
    }

    public static void drawShape (int w, char s) {
        drawFullShape(w,w,s);
    }

    public static void overloadMethod(){
        System.out.println("overloadMethod with no arguments");
    }


    public static void overloadMethod(int i){
        System.out.println("overloadMethod with an int argument with value " + i);
    }


    public static void overloadMethod(String s){
        System.out.println("overloadMethod with a String argument with value " + s);

    }

    private static void overloadMethod(boolean b) {
        System.out.println("overloadMethod with a boolean argument with value " + b);
    }


    public static void main(String[] args) {
        int testResult1 = test(10,20);
        int testResult2 = test(5, 0);
        System.out.println(testResult1);
        System.out.println(testResult2);
        System.out.println(testResult1 + " " +  testResult2);
        System.out.println("ceva");
        System.out.println(isOddNumber(22));
        drawFullShape(15,6);
        System.out.println("-----------------");
        drawShapeOutline(15,6);
        System.out.println("-----------------");
        drawShapeCorners(15,6);
        System.out.println("-----------------");
        overloadMethod();
        overloadMethod(5);
        overloadMethod("shaodjaos");
        overloadMethod(true);
        System.out.println("-----------------");
        drawShape(5);
        System.out.println("-----------------");
        drawShape(5,'b');
    }



}
