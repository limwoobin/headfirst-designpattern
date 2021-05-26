package strategy;

public class FlyWIthWings implements FlyBehavior {
    
    @Override
    public void fly() {
        System.out.println("날고 있어요");    
    }
}
