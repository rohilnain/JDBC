package Singleton;

public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        eagerSingleton.printMessage();
        System.out.println(eagerSingleton.number);

        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
        eagerSingleton1.printMessage();
        System.out.println(eagerSingleton1.number);// it will be still 1 as singleton class has only one instance
        //it is used for logging, database connection etc where only one instance of class is needed

        LazySingleton lazySingleton=  LazySingleton.getInstance();
        lazySingleton.printMessage();
    }
}
