package command.ex1;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(); // Invoker (필요한 작업을 요청할때 사용할 Command 객체를 인자로 전달 받음) - 종업원
        Light light = new Light();  // 실직적인 작업을 수행하는 receiver 객체 - 주방장

        LightOnCommand lightOnCommand = new LightOnCommand(light); // 주문서

        remote.setCommand(lightOnCommand);  // Invoker 가 작업을 전달받고 있음
        remote.buttonWasPressed();
    }
}
