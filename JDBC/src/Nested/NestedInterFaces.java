package Nested;

public interface NestedInterFaces {
    int legs=4;
    void className();
    default void Sound(){
        System.out.println("Outer Nested InterFace default Making Sound");
    }
    static void  staticSound(){
        System.out.println("Outer Nested InterFace static Making Sound");
    }
    public  interface innerInterFace{
        void innerClassName();
        default void InnerSound(){
            System.out.println("INNER Nested InterFace static Making Sound");
            staticSound();
            System.out.println(legs);
            //we cannot use default methods here because interfaces are by default static
            //so non-static member can not be used in inner class.
        }
    }
}
