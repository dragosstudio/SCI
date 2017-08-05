package com.sci;

import static java.lang.Math.*;

public class Rectangle {
    private  double lenght;
    private  double width;

    public void setLenght(double Len){
        lenght= Len;
    }

    public void setWidth(double Wid){
        width=Wid;
    }

    public double getArea(){
        if (lenght != 0||width != 0) {
            return lenght * width;
        }
        return 0;
    }
    public double getPerimeter(){
        if (lenght != 0||width != 0) {
            return (lenght + width)*2;
        }
        return 0;
    }

    public double getDiagonala(){
        if (lenght != 0||width != 0) {
            return Math.sqrt (Math.pow(width,2)+Math.pow(lenght,2));
        }
        return 0;
    }


}
