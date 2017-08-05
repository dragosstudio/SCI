package com.sci;
import com.sci.*;

public class Shapes {
    public static void main(String[] args) {
      for (String s: args) {
          Circle C01 = new Circle();
          Square S01 = new Square();
          double Rad1 = Double.parseDouble(s);
          double squareSide1 = Double.parseDouble(s);
          C01.setRadius(Rad1);
          S01.setsquareSide(squareSide1);
          System.out.println(C01.getAria() + " Si " + S01.getAria());
      }
    }
}
