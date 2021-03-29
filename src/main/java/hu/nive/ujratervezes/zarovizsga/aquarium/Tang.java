package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends AbstractFish {

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }

    @Override
    public void feed() {
        weight++;
    }
}
