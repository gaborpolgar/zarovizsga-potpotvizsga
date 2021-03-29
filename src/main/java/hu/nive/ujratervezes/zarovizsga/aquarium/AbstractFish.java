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

    @Override
    public String status() {
        return name + ", " + "weight: " + weight + ", color: " + color + ", " + "short term memory loss: " + hasMemoryLoss();
    }

    @Override
    public void feed() {
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean hasMemoryLoss();
}
