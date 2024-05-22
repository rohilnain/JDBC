package Abstract;

public class Car extends Vehicle implements ModeOfTransport{
    int wheels =4;
    @Override
    public void vehicleFamilySound(){
        System.out.print("Car family making sound");
    }

    @Override
    public void spellTransportWay() {
        System.out.println("car drives on roadway mainly");
    }
}
