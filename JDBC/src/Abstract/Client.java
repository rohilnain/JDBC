package Abstract;

public class Client {
    public static void main(String[] args) {
        Car car=new Car();
        car.Sound();
        System.out.println(car.interfaceName);
        ModeOfTransport.spellName();
        car.spellTransportWay();
        car.vehicleFamilySound();
    }
}
