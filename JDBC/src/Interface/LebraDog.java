package Interface;

public interface LebraDog extends Animal,Dog{
    String familyName="Lebra german dog";
    static void lebraSound(){
        System.out.println("gurrrr..boooo..boooo..guurrr");
    }

    @Override
    default void familySound() {
        System.out.println("Lebra Dog Family Sound");
    }
    public void lebraBreedSound();
}
