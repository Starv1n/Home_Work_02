package animals;

public class Fish extends Carnivorous implements Swim {

    public Fish() {
        super("Fish");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }

    @Override
    public void drown() {
        System.out.println("Fish is drowning. It's very strange.");
    }
}
