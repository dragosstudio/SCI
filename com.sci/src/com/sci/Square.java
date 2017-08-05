package com.sci;

public class Square {
    double squareSide;

    void setsquareSide(double side) {
        squareSide = side;
    }

    double getAria() {
        if (squareSide != 0) {
            return squareSide * squareSide;
        }
        return 0;
    }
}
