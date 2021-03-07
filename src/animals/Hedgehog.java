package animals;

public class Hedgehog extends Carnivorous implements Run, Voice {

    public Hedgehog() {
        super("Hedgehog");
    }

    @Override
    public void run() {
        System.out.println("Hedgehog is running.");
    }

    @Override
    public String voice() {
        return "Hssssssss!";
    }
}
