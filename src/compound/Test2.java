package compound;

public class Test2 {
    public static void main(String[] args) {
//        전략패턴 + 어댑터 패턴 + 데코레이터 패턴
        Quackable duck = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        GooseAdapter adapter = new GooseAdapter(new Goose());
        Quackable goose = new QuackCounter(adapter);

        Quack.quack_method(duck);
        Quack.quack_method(rubberDuck);
        Quack.quack_method(goose);

        System.out.println(QuackCounter.numberOfQuack);
    }
}
