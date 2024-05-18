package Polymorphism.Overriding_RunTime;

public class Client {
    public static void main(String[] args) {

        System.out.println("Reference variable - parent, Object - parent");
        //Reference variable - parent, Object - parent
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        vehicle.stop();
//      vehicle.crash(); it will give error as crash method is not available in vehicle class

        System.out.println("Reference variable - child, Object - child");
        //Reference variable - child, Object - child
        Car car = new Car();
        car.drive();
        car.stop();
        car.crash();

        System.out.println("Reference variable - parent, Object - child");
        //Reference variable - parent, Object - child
        Vehicle vehicle1 = new Car();
        vehicle1.drive(); //car is driving
        vehicle1.stop();
//      vehicle1.crash();It will givew error as vehhicle class does not have any method called crash

//very imp note if, it would have been a field then accessing it will give value of
//reference variable (in above case Vehicle) but in case of Method true polymorphism happen
//it will hit the Object method
//Fields (variables): Accessing fields depends on the reference type, not the object type.
//Methods (functions): Accessing methods depends on the object type, allowing for polymorphic behavior.
//If you need polymorphic behavior for fields, you would typically use methods
// (getters) to access the fields, allowing the subclass to override these methods


        Vehicle vehicleTruck = new Truck();
        vehicleTruck.drive(); //truck is driving

        System.out.println("Reference variable - child, Object - parent");
        //Reference variable - child, Object - parent
//       Car car1 = new Vehicle();
//        it will give error as we cannot directly downcast like this


        System.out.println("Upcasting");
        //Upcasting (already done when Reference variable - parent, Object - child)
        //Car car2 = new Car();
        Vehicle vehicle2 = (Vehicle) new Car();
        vehicle2.drive(); // car is driving
        vehicle2.stop();
//      vehicle2.crash();

        System.out.println("Downcasting");
//        //Downcasting
//        Car car1 = new Vehicle();
//        it will give error as we cannot directly downcast like this very important
        Vehicle vehicle3 = (Vehicle) new Car(); //upcasting
        Car car3 = (Car) vehicle3; //downcasting
        car3.drive();
        car3.stop();
        car3.crash();

        System.out.println("Class cast Exception");
//        //ClassCastException
//        Vehicle vehicle4 = new Vehicle();
//        Car car4 = (Car)vehicle4;


        Car veh = (Car) abc(new Car());
        veh.crash();

        Vehicle veh1 = abc(new Car());
//        veh1.crash(); will give error as vehicle class does not crash function

        System.out.println("...............");
        Car care = new Car();
        abc(care);

        System.out.println("...............");
        Car incorrectTruck = (Car) abc(new Car());

    }
    public static Vehicle abc(Vehicle veh) {
        veh.drive();
        return veh;
    }

}
