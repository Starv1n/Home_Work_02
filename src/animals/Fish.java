package animals;

public class Fish extends Carnivorous implements Swim {

    public Fish() {
        super("Fish");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
