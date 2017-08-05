package com.sci;

public class Person {
    //Defining atributes
    String name;
    String adress;
    boolean thirsty;
    boolean married;
    float weight;
 ///defining methods
    void eat(String type){
        if(type=="lunch"){
            weight+=1;
        }
        else
        {if (type=="dinner"){
            weight+=0.2;
        }
        else{weight+=0.1;

        }}
    }
    void drink(String drinkType){
        thirsty=false;

    }
    void getMarried(){
        married=true;
        adress="Strada noua";
        name="Nou nume";
    }
    void getDivorced(){
        married=false;
        adress="Strada vechi";
        name="Nou vechi";
    }
}
