package Interface;

public class LebraBreed implements LebraDog{

    @Override
    public void lebraBreedSound() {
        System.out.println("frankfurt breed sound");
    }

    @Override
    public void family() {
        System.out.println("frankfurt breed sound in lebra dog animal family");
    }

    @Override
    public void dogBreedSound() {
        System.out.println("frankfurt breed sound in lebra dog family");
    }
}
