package Interface;

public interface Animal {
    int numberOfAnimals=0;
    String name="Animal Interface";
    void family();
    default void  Sound(){
    System.out.println("Animal making Sound");
    }
    static String nameOfInterface(){
        return "Animal Interface";
    }
    default void familySound(){
        System.out.println("Animal family Sound");
    }
}

//It is to provide standardization.
//It tells what a class must do but does not specify “How”.
//When a class implements an interface, it must provide the behavior of functions published by the interface or that class should be abstract.(C-type charger)
//Interface fields are public, static and final by default, and the methods are public and abstract.
//Multiple inheritance is possible with Interfaces.
//Class can implement multiple interfaces and an interface can extend multiple interfaces.
//From Java8 we can have default and static methods inside the Interface.
//Diamond problem in default method.

