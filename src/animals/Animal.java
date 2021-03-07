package animals;

import food.Food;

public abstract class Animal {

    private final String animalType;
    private String fullness = "[..........]";

    Animal(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void getFullness() {
        System.out.println(animalType + " fullness is " + fullness);
    }

    public void setFullness(int value) {
        if (value>=0 && value <=10) {
            StringBuilder stringBuilder = new StringBuilder(fullness);
            for (int i = 1; i <= value; i++) {
                stringBuilder.setCharAt(i, '+');
            }
            this.fullness = stringBuilder.toString();
        }
    }

    public abstract boolean eat(Food food);
}
