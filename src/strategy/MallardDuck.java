package strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWIthWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
