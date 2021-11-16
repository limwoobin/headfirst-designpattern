package compound;

public class Test {
    public static void main(String[] args) {
//        전략패턴 + 어댑터 패턴

        Quackable duck = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        GooseAdapter adapter = new GooseAdapter(new Goose());

        Quackable goose = adapter;

        Quack.quack_method(duck);
        Quack.quack_method(rubberDuck);
        Quack.quack_method(goose);
    }
}
