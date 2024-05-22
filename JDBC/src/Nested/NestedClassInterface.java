package Nested;

public class NestedClassInterface implements NestedInterFaces{
    static String familyClassName="Nested Class Interfaces";

    @Override
    public void className(){
        System.out.println("Inside Nested class Interfaces");
    }


//    In your NestedClassInterface class, you are implementing the NestedInterFaces interface. However, the innerInterFace interface is
//    a nested interface within NestedInterFaces, not directly within NestedClassInterface.
//    Therefore, when you implement NestedInterFaces in NestedClassInterface, you're not required to implement methods from nested interfaces like innerInterFace.
//    In Java, implementing an interface only requires implementing the methods declared in that interface directly. Nested interfaces, although part of the interface hierarchy,
//    are considered part of their containing interface and are not directly implemented by classes that implement the outer interface.
//    If you want to implement the innerInterFace interface, you would need to do so explicitly in a class that directly implements
//    innerInterFace. Here's how you would do it:
//    public class NestedClassInterface implements NestedInterFaces.innerInterFace {
//        @Override
//        public void innerClassName() {
//            System.out.println("Implementing innerClassName method");
//        }
//    }
}
