package compound;

import compound.factory.AbstractDuckFactory;
import compound.factory.CountingDuckFactory;

public class Test3 {
    public static void main(String[] args) {
//        전략패턴 + 데코레이터 패턴 + 팩토리

        AbstractDuckFactory factory = new CountingDuckFactory();

        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = factory.createGoose();

        Quack.quack_method(duckCall);
        Quack.quack_method(rubberDuck);
        Quack.quack_method(goose);

        System.out.println(QuackCounter.numberOfQuack);
    }
}
