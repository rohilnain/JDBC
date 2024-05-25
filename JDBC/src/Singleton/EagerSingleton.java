package Singleton;

public class EagerSingleton {
    public static int number=0;
    private final static EagerSingleton instance=new EagerSingleton();
    private  EagerSingleton(){
        number++;
        System.out.println("Inside Eager Singleton class default constructor");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
    public static void printMessage(){
        System.out.println("hello from Eager initialised Singleton class");
    }
}
