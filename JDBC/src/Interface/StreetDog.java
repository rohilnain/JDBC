package Interface;

public class StreetDog implements Animal,Dog{
    @Override
    public void dogBreedSound(){
        System.out.println("boo boo boo boo");
    }
    public void family(){
        System.out.println("Indian family Street Dog");
    }
    @Override
    public void familySound(){
        //Animal.super.familySound();
        System.out.println("Street dog family making sound");
    }
}
