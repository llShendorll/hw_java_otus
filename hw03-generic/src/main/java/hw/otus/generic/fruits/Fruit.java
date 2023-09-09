package hw.otus.generic.fruits;

import hw.otus.generic.box.Items;

public class Fruit implements Items {
    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
