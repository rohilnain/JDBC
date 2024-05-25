package Singleton;

public class LazySingleton {
    private static  LazySingleton instance=null;
    private LazySingleton(){
        System.out.println("Inside Lazy Singleton default constructor");
    }
    public static LazySingleton getInstance(){
        if(instance==null){
            instance=new LazySingleton();
            return instance;
        }
        else return instance;
    }
    public static void printMessage(){
        System.out.println("Inside Lazy Singleton class");
    }
}
