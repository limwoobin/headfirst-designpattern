package compound;

import compound.factory.AbstractDuckFactory;
import compound.factory.CountingDuckFactory;

public class Test4 {
    public static void main(String[] args) {
//        전략패턴 + 데코레이터 패턴 + 컴포지트 패턴 + 팩토리

        AbstractDuckFactory factory = new CountingDuckFactory();

        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = factory.createGoose();

        Flock flock = new Flock();
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(goose);

        Quack.quack_method(flock);
        System.out.println(flock);

        System.out.println(QuackCounter.numberOfQuack);
    }
}
