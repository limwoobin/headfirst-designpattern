package decorator.ex3.interface_type;

public class RoadDisplay implements Display {
    
    @Override
    public void draw() {
        System.out.println("기본 도로 표시");
    }
}
