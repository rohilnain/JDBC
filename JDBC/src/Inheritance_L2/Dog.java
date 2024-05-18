package Inheritance_L2;

public class Dog extends Animal{
     int noOfLegs=10;
     String breed;
     Dog() {
        System.out.println("Inside Dog Default constructor");
    }

     Dog(String foodEaten, int noOfLegs, String breed) {
        super(foodEaten);
        System.out.println("Inside Dog parameterised constructor");
        this.breed = breed;
    }

     void bark() {
        System.out.println("barking...");
    }
    void eat(){
         System.out.println("Dog is eating");
    }
}
