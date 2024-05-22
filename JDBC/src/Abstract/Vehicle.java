package Abstract;

public abstract class Vehicle {
     private String family;
     void Sound(){
         System.out.println("Vehicle abstract class making sound");
     }
     abstract void  vehicleFamilySound();

}
