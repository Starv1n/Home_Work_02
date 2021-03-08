package animals;

public class Capybara extends Herbivore implements Run, Swim, Voice {

    public Capybara() {
        super("Capybara");
    }

    @Override
    public void run() {
        System.out.println("Capybara is running.");
    }

    @Override
    public void runningFast() {
        System.out.println("Capybara is running very fast.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Capybara is running very slow.");
    }

    @Override
    public void swim() {
        System.out.println("Capybara is swimming.");
    }

    @Override
    public void drown() {
        System.out.println("Capybara is drowning.");
    }

    @Override
    public String voice() {
        return "amazing sounds of capybara";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
