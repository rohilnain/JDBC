package Interface;

public class Client  {
    public static void main(String[] args) {
        StreetDog streetdog=new StreetDog();
        streetdog.dogBreedSound();//overrided
        streetdog.family();
        streetdog.Sound(); //default method in Animal,no need to override
        Animal.nameOfInterface(); //Static method in Animal can be accessed only by interace name
        Dog.interfaceName();
        System.out.println(Dog.legs);//Static method of dog class, they are inherited unlike static methods (introiduced after java 8)
        streetdog.familySound();

        LebraBreed ldb=new LebraBreed();
        ldb.lebraBreedSound();
        ldb.family();
        ldb.Sound();
        ldb.dogSound();
    }
}
