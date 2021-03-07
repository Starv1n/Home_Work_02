package animals;

import food.Apples;
import food.Food;

public class Alpaca extends Herbivore implements Run, Voice {

    public Alpaca() {
        super("Alpaca");
    }

    @Override
    public void run() {
        System.out.println("Alpaca is running around with no sense.");
    }

    @Override
    public String voice() {
        return "hmmmmmmmm-SCREE-HAW!";
    }
}
