package command.ex1;

public class RemoteControl {
    Command slot;

    public RemoteControl() {

    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
