package Inheritance_L2;

public class Client {
    public static void main (String []args){
        Dog dog=new Dog();
      // System.out.println(dog.isVegetarian); cannot be accessed as it is private

        Dog dog1=new Dog("Roti",4,"Indian Street");
        System.out.println(dog1.foodEaten);
        System.out.println(dog1.noOfLegs);
        System.out.println(dog1.breed);

        Animal animal=new Animal("roti",4);
        animal.eat();

        Dog dog2=new Dog();
        dog2.eat();
        System.out.println(dog2.noOfLegs);

        Animal animal2 =new Animal();
        animal2.eat();
        System.out.println(animal2.noOfLegs);

        Cat cat=new Cat();
        cat.makeNoise();

    }
}


//Note for inheritance, it inherits all those which are encaspsulatedly correct to inherit
//means access modifier taken in account first while seeing inheritance