package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class AbstractFish implements Fish {
    public AbstractFish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    String name;
    int weight;
    String color;
    boolean isShortMemLoss;

    @Override
    public String status() {
        return name + ", " + "weight: " + weight + "color: " + color + ", " + "short-term memory loss: " + isShortMemLoss;
    }

    @Override
    public void feed() {
    }

}
