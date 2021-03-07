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
    public void swim() {
        System.out.println("Capybara is swimming.");
    }

    @Override
    public String voice() {
        return "Amazing sounds of Capybara";
    }
}
