package com.sci;

public class Circle {
    double radius;

    void setRadius(double rad){
        radius=rad;
    }
    double getAria(){
        if(radius!=0)
        {
            return 3.1415* radius* radius;
        }
        return 0;
    }
}
