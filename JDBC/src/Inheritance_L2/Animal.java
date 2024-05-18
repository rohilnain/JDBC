package Inheritance_L2;

public class Animal {
    String foodEaten="abc"; //null

    int noOfLegs=4; //0

    private boolean isVegetarian;

     Animal() {
        System.out.println("Inside Animal Default constructor");
    }

     Animal(String foodEaten) {
        System.out.println("Inside Animal Parameterised constructor 1");
        this.foodEaten = foodEaten;
        this.isVegetarian = false;
    }
     Animal(String foodEaten, int noOfLegs) {
        System.out.println("Inside Animal Parameterised constructor 2");
        this.foodEaten = foodEaten;
        this.noOfLegs = noOfLegs;
        this.isVegetarian = false;
    }

     void eat(){
        System.out.println("Animal is eating");
    }
}
