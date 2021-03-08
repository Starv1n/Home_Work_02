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

        Animal[] animals = new Animal[]{alpaca, capybara, duck, fish, hedgehog, platypus};
        Food[] foods = new Food[]{apples, insects, mediumRareSteak, mushrooms, seaweed, smallFish};

        fish.getFullness();
        fish.eat(insects);
        fish.getFullness();
        worker.feed(fish, smallFish);
        fish.getFullness();

        System.out.println();

        for (Food food : foods) {
            for (Animal animal : animals) {
                worker.feed(animal, food);
            }
            System.out.println();
        }

        worker.doAnimalRun(hedgehog);
        worker.doAnimalSwim(fish);
        worker.doAnimalFly(duck);
        worker.getVoice(alpaca);

        System.out.println();

        Swim[] pool = new Swim[]{new Fish(), new Platypus(), new Duck(), new Capybara()};
        for (Swim animal : pool) {
            animal.swim();
        }
    }
}
