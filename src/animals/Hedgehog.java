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
    public void runningFast() {
        System.out.println("Hedgehog is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Hedgehog is running very slow.");
    }

    @Override
    public String voice() {
        return "hssssssss!";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
