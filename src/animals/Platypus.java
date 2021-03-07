package animals;

public class Platypus extends Carnivorous implements Run, Swim, Voice{

    public Platypus() {
        super("Platypus");
    }

    @Override
    public void run() {
        System.out.println("Platypus is running.");
    }

    @Override
    public void swim() {
        System.out.println("Platypus is swimming.");
    }

    @Override
    public String voice() {
        return "Grrrhrhrhaouhdqoifd";
    }
}
