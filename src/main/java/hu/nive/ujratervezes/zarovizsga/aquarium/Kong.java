package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Kong extends AbstractFish{


    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }

    @Override
    public String status() {
        return super.status();
    }

    @Override
    public void feed() {
        weight = weight + 2;
    }
}
