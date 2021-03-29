package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Aquarium {

    List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish... fishes) {
        for (Fish fish : fishes) {
            aquarium.add(fish);
        }
    }

    public void feed() {
        for (Fish fish : aquarium) {
            fish.feed();
        }
    }

    public void removeFish() {
        Iterator<Fish> iterator = aquarium.iterator();
        while (iterator.hasNext()) {
            Fish fish = iterator.next();
            if (fish.getWeight() >= 11) {
                iterator.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : aquarium) {
            result.add(fish.status());
        }
        return result;
    }
}
