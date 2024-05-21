package Interface;

public interface Dog {
    int legs=2;
    void dogBreedSound();
    default void dogSound(){
        System.out.println("Dog is Making Sound");
    }
    static void interfaceName(){
        System.out.println("Inside DOg Interface");
    }
    default void familySound(){
        System.out.println("Dog family Sound");
    }
}
