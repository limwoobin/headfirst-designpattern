package compound;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> duckList = new ArrayList<>();

    public void add(Quackable quackable) {
        duckList.add(quackable);
    }

    @Override
    public void quack() {
        for (Quackable quackable : duckList) {
            quackable.quack();
        }
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
