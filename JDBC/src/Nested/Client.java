package Nested;

public class Client extends NestedClasses{
    public static void main(String[] args) {
        //Normal inner class invocation
        ////can be instantiated by using the object of outer class
        NestedClasses nestedclasses=new NestedClasses();
        NestedClasses.InnearClass innearclass= nestedclasses.new InnearClass();
        innearclass.Sound();

        //Static inner class invocation
        //Static Inner class can only access static member of outside class
        //can be instantiated by using the Class name of outer class
        NestedClasses.StaticInnerClass staticInnerClass=new NestedClasses.StaticInnerClass();
        staticInnerClass.Sound();

        //Accessing nested normal class within a nested inner static class.

        NestedClasses.StaticInnerClass.NormalInnerStaticClass nIIC= staticInnerClass. new NormalInnerStaticClass();
        nIIC.Sound();

        //Accessing nested static class within a nested inner static class.

        NestedClasses.StaticInnerClass.StaticInnerStaticClass sIIC=new NestedClasses.StaticInnerClass.StaticInnerStaticClass();
        sIIC.Sound();

        //So simply static Nested Class can be instantiated using Outer ClassName
        //while normal class needs an object of outer class


        //playing with Nested Interfaces with classes
        NestedClassInterface nCI=new NestedClassInterface();
        nCI.className();
        nCI.Sound();
    }
}
