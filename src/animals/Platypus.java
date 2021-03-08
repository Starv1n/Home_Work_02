package animals;

public class Platypus extends Carnivorous implements Run, Swim, Voice {

    public Platypus() {
        super("Platypus");
    }

    @Override
    public void run() {
        System.out.println("Platypus is running.");
    }

    @Override
    public void runningFast() {
        System.out.println("Platypus is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Platypus is running very slow.");
    }

    @Override
    public void swim() {
        System.out.println("Platypus is swimming.");
    }

    @Override
    public void drown() {
        System.out.println("Platypus is drowning.");
    }

    @Override
    public String voice() {
        return "Grrrhrhrhaouhdqoifd";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
