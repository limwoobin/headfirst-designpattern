package compound.factory;

import compound.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGoose() {
        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());
        return new QuackCounter(gooseAdapter);
    }
}
