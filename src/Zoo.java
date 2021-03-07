import animals.*;
import food.*;
import ZooService.Worker;

public class Zoo {
    public static void main(String[] args) {

        Worker worker = new Worker();

        Alpaca alpaca = new Alpaca();
        Capybara capybara = new Capybara();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Hedgehog hedgehog = new Hedgehog();
        Platypus platypus = new Platypus();

        Food apples = new Apples();
        Food insects = new Insects();
        Food mediumRareSteak = new MediumRareSteak();
        Food mushrooms = new Mushrooms();
        Food seaweed = new Seaweed();
        Food smallFish = new SmallFish();

        worker.feed(duck,seaweed);
        worker.feed(duck,mediumRareSteak);

        System.out.println();

        worker.feed(platypus,apples);
        worker.feed(platypus,insects);

        System.out.println();

        fish.getFullness();
        fish.eat(insects);
        fish.getFullness();
        worker.feed(fish,smallFish);
        fish.getFullness();

        System.out.println();

        worker.getVoice(alpaca);

        System.out.println();

        Swim[] pool = new Swim[] {new Fish(), new Platypus(), new Duck(), new Capybara()};
        for (Swim animal: pool) {
            animal.swim();
        }
    }
}
