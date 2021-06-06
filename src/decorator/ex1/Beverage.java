package decorator.ex1;

public abstract class Beverage {
    String description = "제목 없음";
    double cost = 0;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
