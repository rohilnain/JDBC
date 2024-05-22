package Nested;

public class NestedClasses {
    private int legs;
    private static String family="Outer Nested Class";
    public void Sound(){
        System.out.println("Nested Class Making Sound");
    }
    public void className(){
        System.out.println("Inside Outer class");
    }
    public class InnearClass{
        //can access any member  of outside class
        //can be Instantiated using Outer class Name
        void Sound(){
            System.out.println("Inner Nested Class Making Sound");
            className();
        }
    }
    static class StaticInnerClass{
        //can only access static member of outside class
        //can be Instantiated using Outer class Name
        static String className="Static Inner Class";
        void Sound(){
            System.out.println("Static Inner Nested Class Making Sound");
            System.out.println(family);
        }
        class NormalInnerStaticClass {
            void Sound() {
                System.out.println("Normal class within Static Inner Nested Class Making Sound");
                System.out.println(className);
            }
        }
        static class StaticInnerStaticClass {
            void Sound() {
                System.out.println("Static class within Static Inner Nested Class Making Sound");
                System.out.println(className);
            }
        }
    }

}
