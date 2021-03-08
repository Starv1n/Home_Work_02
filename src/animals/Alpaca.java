package animals;

public class Alpaca extends Herbivore implements Run, Voice {

    public Alpaca() {
        super("Alpaca");
    }

    @Override
    public void run() {
        System.out.println("Alpaca is running around with no sense.");
    }

    @Override
    public void runningFast() {
        System.out.println("Alpaca is running around very fast with no sense.");
    }

    @Override
    public void runningSlow() {
        System.out.println("Alpaca is running around very slow with no sense.");
    }

    @Override
    public String voice() {
        return "hmmmmmmmm-scree-haw!";
    }

    @Override
    public String voiceLoud() {
        return voice().toUpperCase();
    }
}
