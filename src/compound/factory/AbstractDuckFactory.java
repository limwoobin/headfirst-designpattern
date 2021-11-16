package compound.factory;

import compound.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
    public abstract Quackable createGoose();
}
